package com.raiffeisen.cources.pages;

public abstract class SearchPage extends AbstractPage {
    public abstract void search(String query);
    public abstract boolean isSearchResultAvailable();
}
