package com.zahirherz.sample.filmapp.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0016\u0010\u0017\u001a\u00020\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0016H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/zahirherz/sample/filmapp/main/MainPresenter;", "Lcom/zahirherz/sample/filmapp/main/MainContract$PresenterInterface;", "viewInterface", "Lcom/zahirherz/sample/filmapp/main/MainContract$ViewInterface;", "dataSource", "Lcom/zahirherz/sample/filmapp/model/LocalDataSource;", "(Lcom/zahirherz/sample/filmapp/main/MainContract$ViewInterface;Lcom/zahirherz/sample/filmapp/model/LocalDataSource;)V", "TAG", "", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "myMoviesObservable", "Lio/reactivex/Observable;", "", "Lcom/zahirherz/sample/filmapp/model/Movie;", "getMyMoviesObservable", "()Lio/reactivex/Observable;", "observer", "Lio/reactivex/observers/DisposableObserver;", "getObserver", "()Lio/reactivex/observers/DisposableObserver;", "getMyMoviesList", "", "onDelete", "selectedMovies", "Ljava/util/HashSet;", "stop", "app_debug"})
public final class MainPresenter implements com.zahirherz.sample.filmapp.main.MainContract.PresenterInterface {
    private final java.lang.String TAG = "MainPresenter";
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    private com.zahirherz.sample.filmapp.main.MainContract.ViewInterface viewInterface;
    private com.zahirherz.sample.filmapp.model.LocalDataSource dataSource;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.util.List<com.zahirherz.sample.filmapp.model.Movie>> getMyMoviesObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.observers.DisposableObserver<java.util.List<com.zahirherz.sample.filmapp.model.Movie>> getObserver() {
        return null;
    }
    
    @java.lang.Override()
    public void getMyMoviesList() {
    }
    
    @java.lang.Override()
    public void onDelete(@org.jetbrains.annotations.NotNull()
    java.util.HashSet<com.zahirherz.sample.filmapp.model.Movie> selectedMovies) {
    }
    
    @java.lang.Override()
    public void stop() {
    }
    
    public MainPresenter(@org.jetbrains.annotations.NotNull()
    com.zahirherz.sample.filmapp.main.MainContract.ViewInterface viewInterface, @org.jetbrains.annotations.NotNull()
    com.zahirherz.sample.filmapp.model.LocalDataSource dataSource) {
        super();
    }
}