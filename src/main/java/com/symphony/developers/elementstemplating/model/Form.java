package com.symphony.developers.elementstemplating.model;

import java.util.List;

public class Form {
    private String id;
    private String title;
    private List<Element> elements;

    public Form(String id, String title, List<Element> elements) {
        this.id = id;
        this.title = title;
        this.elements = elements;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Element> getElements() {
        return elements;
    }

    public void setElements(List<Element> elements) {
        this.elements = elements;
    }
}
