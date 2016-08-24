package it.ennova.phonefield.view.callbacks;

import android.support.v7.widget.SearchView;

import it.ennova.phonefield.internal.FilteringAbstractController;

public class SearchViewCallbacks {

    public static class Query implements SearchView.OnQueryTextListener {
        private final FilteringAbstractController controller;

        public Query(FilteringAbstractController controller) {
            this.controller = controller;
        }

        @Override
        public boolean onQueryTextSubmit(String query) {
            controller.onFilterTyped(query);
            return false;
        }

        @Override
        public boolean onQueryTextChange(String newText) {
            controller.onFilterTyped(newText);
            return false;
        }
    }
}
