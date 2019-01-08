package com.zahirherz.sample.filmapp.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\bH\u0016J\b\u0010\u0018\u001a\u00020\u0016H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR#\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00120\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/zahirherz/sample/filmapp/search/SearchPresenter;", "Lcom/zahirherz/sample/filmapp/search/SearchContract$PresenterInterface;", "viewInterface", "Lcom/zahirherz/sample/filmapp/search/SearchContract$ViewInterface;", "dataSource", "Lcom/zahirherz/sample/filmapp/model/RemoteDataSource;", "(Lcom/zahirherz/sample/filmapp/search/SearchContract$ViewInterface;Lcom/zahirherz/sample/filmapp/model/RemoteDataSource;)V", "TAG", "", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "observer", "Lio/reactivex/observers/DisposableObserver;", "Lcom/zahirherz/sample/filmapp/model/TmdbResponse;", "getObserver", "()Lio/reactivex/observers/DisposableObserver;", "searchResultsObservable", "Lkotlin/Function1;", "Lio/reactivex/Observable;", "getSearchResultsObservable", "()Lkotlin/jvm/functions/Function1;", "getSearchResults", "", "query", "stop", "app_debug"})
public final class SearchPresenter implements com.zahirherz.sample.filmapp.search.SearchContract.PresenterInterface {
    private final java.lang.String TAG = "SearchPresenter";
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<java.lang.String, io.reactivex.Observable<com.zahirherz.sample.filmapp.model.TmdbResponse>> searchResultsObservable = null;
    private com.zahirherz.sample.filmapp.search.SearchContract.ViewInterface viewInterface;
    private com.zahirherz.sample.filmapp.model.RemoteDataSource dataSource;
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<java.lang.String, io.reactivex.Observable<com.zahirherz.sample.filmapp.model.TmdbResponse>> getSearchResultsObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.observers.DisposableObserver<com.zahirherz.sample.filmapp.model.TmdbResponse> getObserver() {
        return null;
    }
    
    @java.lang.Override()
    public void getSearchResults(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    @java.lang.Override()
    public void stop() {
    }
    
    public SearchPresenter(@org.jetbrains.annotations.NotNull()
    com.zahirherz.sample.filmapp.search.SearchContract.ViewInterface viewInterface, @org.jetbrains.annotations.NotNull()
    com.zahirherz.sample.filmapp.model.RemoteDataSource dataSource) {
        super();
    }
}