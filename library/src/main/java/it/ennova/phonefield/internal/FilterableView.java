package it.ennova.phonefield.internal;


import java.util.List;

public interface FilterableView<T> {

    void onFilterApplied(List<T> data);
}
