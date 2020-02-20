package com.symphony.developers.elementstemplating.listener;

import com.symphony.developers.elementstemplating.TemplatingBot;
import com.symphony.developers.elementstemplating.model.Order;
import com.symphony.developers.elementstemplating.service.DataService;
import com.symphony.developers.elementstemplating.service.TemplateService;
import listeners.ElementsListener;
import model.User;
import model.events.SymphonyElementsAction;

public class ElementsListenerImpl implements ElementsListener {
    public void onElementsAction(User initiator, SymphonyElementsAction action) {
        String streamId = action.getStreamId();
        Order order = DataService.prepareOrder(action.getFormValues());

        TemplatingBot.sendMessage(streamId, TemplateService.processHandlebars("response", order));

        String orderString = DataService.toString(order);
        TemplatingBot.sendMessage(streamId, TemplateService.processFreeMarker("response", orderString));
    }
}
