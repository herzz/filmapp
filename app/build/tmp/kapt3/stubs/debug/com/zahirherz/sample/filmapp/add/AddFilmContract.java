package com.zahirherz.sample.filmapp.add;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lcom/zahirherz/sample/filmapp/add/AddFilmContract;", "", "()V", "PresenterInterface", "ViewInterface", "app_debug"})
public final class AddFilmContract {
    
    public AddFilmContract() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&\u00a8\u0006\b"}, d2 = {"Lcom/zahirherz/sample/filmapp/add/AddFilmContract$PresenterInterface;", "", "addMovie", "", "title", "", "releaseDate", "posterPath", "app_debug"})
    public static abstract interface PresenterInterface {
        
        public abstract void addMovie(@org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.NotNull()
        java.lang.String releaseDate, @org.jetbrains.annotations.NotNull()
        java.lang.String posterPath);
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0003H&\u00a8\u0006\b"}, d2 = {"Lcom/zahirherz/sample/filmapp/add/AddFilmContract$ViewInterface;", "", "displayError", "", "message", "", "displayMessage", "returnToMain", "app_debug"})
    public static abstract interface ViewInterface {
        
        public abstract void returnToMain();
        
        public abstract void displayMessage(@org.jetbrains.annotations.NotNull()
        java.lang.String message);
        
        public abstract void displayError(@org.jetbrains.annotations.NotNull()
        java.lang.String message);
    }
}