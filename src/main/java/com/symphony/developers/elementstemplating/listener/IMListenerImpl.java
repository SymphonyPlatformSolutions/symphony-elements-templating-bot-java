package com.symphony.developers.elementstemplating.listener;

import com.symphony.developers.elementstemplating.TemplatingBot;
import com.symphony.developers.elementstemplating.model.Form;
import com.symphony.developers.elementstemplating.service.DataService;
import listeners.IMListener;
import model.InboundMessage;
import model.Stream;
import com.symphony.developers.elementstemplating.service.TemplateService;

public class IMListenerImpl implements IMListener {
    public void onIMMessage(InboundMessage msg) {
        String streamId = msg.getStream().getStreamId();
        Form form = DataService.prepareForm();

        TemplatingBot.sendMessage(streamId, TemplateService.processHandlebars("form", form));

        String formString = DataService.toString(form);
        TemplatingBot.sendMessage(streamId, TemplateService.processFreeMarker("form", formString));

    }

    public void onIMCreated(Stream stream) {}
}
