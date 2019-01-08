package com.zahirherz.sample.filmapp.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lcom/zahirherz/sample/filmapp/search/SearchContract;", "", "()V", "PresenterInterface", "ViewInterface", "app_debug"})
public final class SearchContract {
    
    public SearchContract() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&\u00a8\u0006\u0007"}, d2 = {"Lcom/zahirherz/sample/filmapp/search/SearchContract$PresenterInterface;", "", "getSearchResults", "", "query", "", "stop", "app_debug"})
    public static abstract interface PresenterInterface {
        
        public abstract void getSearchResults(@org.jetbrains.annotations.NotNull()
        java.lang.String query);
        
        public abstract void stop();
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&\u00a8\u0006\n"}, d2 = {"Lcom/zahirherz/sample/filmapp/search/SearchContract$ViewInterface;", "", "displayError", "", "message", "", "displayMessage", "displayResult", "tmdbResponse", "Lcom/zahirherz/sample/filmapp/model/TmdbResponse;", "app_debug"})
    public static abstract interface ViewInterface {
        
        public abstract void displayResult(@org.jetbrains.annotations.NotNull()
        com.zahirherz.sample.filmapp.model.TmdbResponse tmdbResponse);
        
        public abstract void displayMessage(@org.jetbrains.annotations.NotNull()
        java.lang.String message);
        
        public abstract void displayError(@org.jetbrains.annotations.NotNull()
        java.lang.String message);
    }
}