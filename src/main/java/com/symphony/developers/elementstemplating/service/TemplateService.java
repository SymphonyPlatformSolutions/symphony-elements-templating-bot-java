package com.symphony.developers.elementstemplating.service;

import com.github.jknack.handlebars.Handlebars;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import model.OutboundMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TemplateService {
    private static final Logger log = LoggerFactory.getLogger(TemplateService.class);
    private static Handlebars handlebars = new Handlebars();

    static {
        // Custom helper to test for equality
        handlebars.registerHelper("equals", (value, options) ->
            value.equals(options.params[0]) ? options.fn() : options.inverse());
    }

    public static OutboundMessage processFreeMarker(String templateName, String data) {
        String template = loadTemplate(templateName + ".ftl");
        return new OutboundMessage(template, data);
    }

    public static OutboundMessage processHandlebars(String templateName, Object data) {
        try {
            String template = loadTemplate(templateName + ".hbs");
            String compiledMessage = handlebars.compileInline(template).apply(data);
            return new OutboundMessage(compiledMessage);
        } catch (IOException e) {
            log.error("Unable to process and send Handlebars message", e);
            return null;
        }
    }

    private static String loadTemplate(String filename) {
        try {
            Path path = Paths.get(TemplateService.class.getResource("/" + filename).toURI());
            return String.join("\n", Files.readAllLines(path));
        } catch (IOException | URISyntaxException e) {
            log.error("Error loading template", e);
            return null;
        }
    }
}
