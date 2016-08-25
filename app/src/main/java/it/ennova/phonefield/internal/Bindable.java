package it.ennova.phonefield.internal;


public interface Bindable<T> {

    void bindTo(T t);

    T getData();
}
