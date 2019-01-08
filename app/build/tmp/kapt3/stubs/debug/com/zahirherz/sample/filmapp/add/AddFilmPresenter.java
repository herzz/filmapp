package com.zahirherz.sample.filmapp.add;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/zahirherz/sample/filmapp/add/AddFilmPresenter;", "Lcom/zahirherz/sample/filmapp/add/AddFilmContract$PresenterInterface;", "viewInterface", "Lcom/zahirherz/sample/filmapp/add/AddFilmContract$ViewInterface;", "dataSource", "Lcom/zahirherz/sample/filmapp/model/LocalDataSource;", "(Lcom/zahirherz/sample/filmapp/add/AddFilmContract$ViewInterface;Lcom/zahirherz/sample/filmapp/model/LocalDataSource;)V", "addMovie", "", "title", "", "releaseDate", "posterPath", "app_debug"})
public final class AddFilmPresenter implements com.zahirherz.sample.filmapp.add.AddFilmContract.PresenterInterface {
    private com.zahirherz.sample.filmapp.add.AddFilmContract.ViewInterface viewInterface;
    private com.zahirherz.sample.filmapp.model.LocalDataSource dataSource;
    
    @java.lang.Override()
    public void addMovie(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String releaseDate, @org.jetbrains.annotations.NotNull()
    java.lang.String posterPath) {
    }
    
    public AddFilmPresenter(@org.jetbrains.annotations.NotNull()
    com.zahirherz.sample.filmapp.add.AddFilmContract.ViewInterface viewInterface, @org.jetbrains.annotations.NotNull()
    com.zahirherz.sample.filmapp.model.LocalDataSource dataSource) {
        super();
    }
}