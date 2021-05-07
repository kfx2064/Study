package org.hdcd.common.domain;

import java.io.Serial;
import java.io.Serializable;

public class CodeLabelValue implements Serializable {

    @Serial
    private static final long serialVersionUID = 6879283977684052713L;

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
}
