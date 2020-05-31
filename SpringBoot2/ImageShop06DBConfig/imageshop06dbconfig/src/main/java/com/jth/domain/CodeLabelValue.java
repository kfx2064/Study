package com.jth.domain;

import java.io.Serializable;

public class CodeLabelValue implements Serializable {

    private static final long serialVersionUID = -6161769388364293381L;

    private String label;
    private String value;

    public CodeLabelValue() {
        super();
    }

    public CodeLabelValue(String value, String label) {
        this.value = value;
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "CodeLabelValue{" +
                "label='" + label + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
