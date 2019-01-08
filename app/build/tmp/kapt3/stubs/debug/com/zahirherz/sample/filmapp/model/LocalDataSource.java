package com.zahirherz.sample.filmapp.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bJ\u000e\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bR \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/zahirherz/sample/filmapp/model/LocalDataSource;", "", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "allMovies", "Lio/reactivex/Observable;", "", "Lcom/zahirherz/sample/filmapp/model/Movie;", "getAllMovies", "()Lio/reactivex/Observable;", "movieDao", "Lcom/zahirherz/sample/filmapp/model/MovieDao;", "delete", "", "movie", "insert", "app_debug"})
public class LocalDataSource {
    private final com.zahirherz.sample.filmapp.model.MovieDao movieDao = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.Observable<java.util.List<com.zahirherz.sample.filmapp.model.Movie>> allMovies = null;
    
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Observable<java.util.List<com.zahirherz.sample.filmapp.model.Movie>> getAllMovies() {
        return null;
    }
    
    public final void insert(@org.jetbrains.annotations.NotNull()
    com.zahirherz.sample.filmapp.model.Movie movie) {
    }
    
    public final void delete(@org.jetbrains.annotations.NotNull()
    com.zahirherz.sample.filmapp.model.Movie movie) {
    }
    
    public LocalDataSource(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super();
    }
}