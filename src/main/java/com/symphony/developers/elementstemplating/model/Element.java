package com.symphony.developers.elementstemplating.model;

import model.FormButtonType;

public class Element {
    private ElementTag tag;
    private String name;
    private String value;
    private String placeholder;
    private FormButtonType type;
    private boolean selfClosing;

    public Element() {}

    public Element(ElementTag tag, String name, String placeholder) {
        this.tag = tag;
        this.name = name;
        this.placeholder = placeholder;
    }

    public Element(ElementTag tag, String name, FormButtonType type, String value) {
        this.tag = tag;
        this.name = name;
        this.type = type;
        this.value = value;
    }

    public String getTag() {
        return tag.tag;
    }

    public void setTag(ElementTag tag) {
        this.tag = tag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value == null ? "" : value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getPlaceholder() {
        return placeholder;
    }

    public void setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
    }

    public String getType() {
        if (type == null) {
            return null;
        }
        return type.name().toLowerCase();
    }

    public void setType(FormButtonType type) {
        this.type = type;
    }

    public boolean isSelfClosing() {
        return selfClosing;
    }

    public void setSelfClosing(boolean selfClosing) {
        this.selfClosing = selfClosing;
    }
}
