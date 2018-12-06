package org.vaadin.firitin.fluency.ui;

import com.vaadin.flow.data.binder.HasDataProvider;
import com.vaadin.flow.data.binder.HasFilterableDataProvider;
import com.vaadin.flow.data.provider.DataProvider;

@SuppressWarnings("unchecked")
public interface FluentHasFilterableDataProvider<S extends FluentHasFilterableDataProvider<S, T>, T>
        extends HasFilterableDataProvider<T, String>, FluentHasItems<S, T> {

    default S withDataProvider(DataProvider<T, String> dataProvider) {
        setDataProvider(dataProvider);
        return (S) this;
    }

}
