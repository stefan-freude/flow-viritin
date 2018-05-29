package org.vaadin.firitin.fluency.ui;

import com.vaadin.flow.component.HasText;

public interface FluentHasText<S extends FluentHasText<S> & HasText> extends HasText {

    default S withText(String text) {
        setText(text);
        return (S) this;
    }

}