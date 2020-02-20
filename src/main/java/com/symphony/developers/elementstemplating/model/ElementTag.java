package com.symphony.developers.elementstemplating.model;

public enum ElementTag {
    TEXTFIELD("text-field"),
    CHECKBOX("checkbox"),
    RADIO("radio"),
    SELECT("select"),
    OPTION("option"),
    PERSONSELECTOR("person-selector"),
    TEXTAREA("textarea"),
    BUTTON("button");

    public final String tag;

    private ElementTag(String tag) {
        this.tag = tag;
    }
}
