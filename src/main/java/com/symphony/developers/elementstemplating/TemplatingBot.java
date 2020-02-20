package com.symphony.developers.elementstemplating;

import clients.SymBotClient;
import com.symphony.developers.elementstemplating.listener.ElementsListenerImpl;
import com.symphony.developers.elementstemplating.listener.IMListenerImpl;
import model.OutboundMessage;
import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TemplatingBot {
    private static final Logger log = LoggerFactory.getLogger(TemplatingBot.class);
    private static SymBotClient botClient;

    public static void main(String[] args) {
        BasicConfigurator.configure();

        try {
            botClient = SymBotClient.initBotRsa("config.json");
            botClient.getDatafeedEventsService().addListeners(
                new IMListenerImpl(),
                new ElementsListenerImpl()
            );
        } catch (Exception e) {
            log.error("Error", e);
        }
    }

    public static void sendMessage(String streamId, OutboundMessage msg) {
        botClient.getMessagesClient().sendMessage(streamId, msg);
    }
}
