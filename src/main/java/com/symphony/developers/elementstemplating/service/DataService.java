package com.symphony.developers.elementstemplating.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.symphony.developers.elementstemplating.model.Element;
import com.symphony.developers.elementstemplating.model.ElementTag;
import com.symphony.developers.elementstemplating.model.Form;
import com.symphony.developers.elementstemplating.model.Order;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import model.FormButtonType;

public class DataService {
    private static ObjectMapper objectMapper = new ObjectMapper();

    public static Order prepareOrder(Map<String, Object> upstreamOrder) {
        return new Order("Pending Delivery", upstreamOrder);
    }

    public static Form prepareForm() {
        List<Element> elements = new ArrayList<>();
        elements.add(new Element(ElementTag.TEXTFIELD, "name", "Name"));
        elements.add(new Element(ElementTag.TEXTFIELD, "price", "Price"));
        elements.add(new Element(ElementTag.TEXTFIELD, "quantity", "Quantity"));
        elements.add(new Element(ElementTag.BUTTON, "submit", FormButtonType.ACTION, "Order"));
        return new Form("form-id", "Order Form", elements);
    }

    public static String toString(Object o) {
        try {
            return objectMapper.writeValueAsString(o);
        } catch (JsonProcessingException e) {
            return null;
        }
    }
}
