package it.ennova.phonefield.internal;


interface Bindable<T> {

    void bindTo(T t);

    T getData();
}
