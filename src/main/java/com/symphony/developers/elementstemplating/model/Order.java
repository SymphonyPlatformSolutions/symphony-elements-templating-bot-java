package com.symphony.developers.elementstemplating.model;

import java.util.Map;

public class Order {
    private String status;
    private Map<String, Object> item;

    public Order(String status, Map<String, Object> item) {
        this.status = status;
        this.item = item;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Map<String, Object> getItem() {
        return item;
    }

    public void setItems(Map<String, Object> item) {
        this.item = item;
    }
}
