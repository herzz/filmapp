package com.zahirherz.sample.filmapp.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0002$%B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0011H\u0016J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0011H\u0016J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0012\u0010\u001d\u001a\u00020\u00172\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\b\u0010 \u001a\u00020\u0017H\u0014J\b\u0010!\u001a\u00020\u0017H\u0014J\b\u0010\"\u001a\u00020\u0017H\u0002J\b\u0010#\u001a\u00020\u0017H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/zahirherz/sample/filmapp/search/SearchActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/zahirherz/sample/filmapp/search/SearchContract$ViewInterface;", "()V", "adapter", "Lcom/zahirherz/sample/filmapp/search/SearchAdapter;", "itemListener", "Lcom/zahirherz/sample/filmapp/search/SearchActivity$RecyclerItemListener;", "getItemListener$app_debug", "()Lcom/zahirherz/sample/filmapp/search/SearchActivity$RecyclerItemListener;", "setItemListener$app_debug", "(Lcom/zahirherz/sample/filmapp/search/SearchActivity$RecyclerItemListener;)V", "noMoviesTextView", "Landroid/widget/TextView;", "progressBar", "Landroid/widget/ProgressBar;", "query", "", "searchPresenter", "Lcom/zahirherz/sample/filmapp/search/SearchPresenter;", "searchResultsRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "displayError", "", "message", "displayMessage", "displayResult", "tmdbResponse", "Lcom/zahirherz/sample/filmapp/model/TmdbResponse;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onStop", "setupPresenter", "setupViews", "Companion", "RecyclerItemListener", "app_debug"})
public final class SearchActivity extends androidx.appcompat.app.AppCompatActivity implements com.zahirherz.sample.filmapp.search.SearchContract.ViewInterface {
    private androidx.recyclerview.widget.RecyclerView searchResultsRecyclerView;
    private com.zahirherz.sample.filmapp.search.SearchAdapter adapter;
    private android.widget.TextView noMoviesTextView;
    private android.widget.ProgressBar progressBar;
    private com.zahirherz.sample.filmapp.search.SearchPresenter searchPresenter;
    private java.lang.String query;
    
    /**
     * * Listener for clicks on tasks in the ListView.
     */
    @org.jetbrains.annotations.NotNull()
    private com.zahirherz.sample.filmapp.search.SearchActivity.RecyclerItemListener itemListener;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String SEARCH_QUERY = "searchQuery";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String EXTRA_TITLE = "SearchActivity.TITLE_REPLY";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String EXTRA_RELEASE_DATE = "SearchActivity.RELEASE_DATE_REPLY";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String EXTRA_POSTER_PATH = "SearchActivity.POSTER_PATH_REPLY";
    public static final com.zahirherz.sample.filmapp.search.SearchActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    private final void setupViews() {
    }
    
    private final void setupPresenter() {
    }
    
    @java.lang.Override()
    public void displayResult(@org.jetbrains.annotations.NotNull()
    com.zahirherz.sample.filmapp.model.TmdbResponse tmdbResponse) {
    }
    
    @java.lang.Override()
    public void displayMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @java.lang.Override()
    public void displayError(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.zahirherz.sample.filmapp.search.SearchActivity.RecyclerItemListener getItemListener$app_debug() {
        return null;
    }
    
    public final void setItemListener$app_debug(@org.jetbrains.annotations.NotNull()
    com.zahirherz.sample.filmapp.search.SearchActivity.RecyclerItemListener p0) {
    }
    
    public SearchActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/zahirherz/sample/filmapp/search/SearchActivity$RecyclerItemListener;", "", "onItemClick", "", "view", "Landroid/view/View;", "position", "", "app_debug"})
    public static abstract interface RecyclerItemListener {
        
        public abstract void onItemClick(@org.jetbrains.annotations.NotNull()
        android.view.View view, int position);
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lcom/zahirherz/sample/filmapp/search/SearchActivity$Companion;", "", "()V", "EXTRA_POSTER_PATH", "", "getEXTRA_POSTER_PATH", "()Ljava/lang/String;", "EXTRA_RELEASE_DATE", "getEXTRA_RELEASE_DATE", "EXTRA_TITLE", "getEXTRA_TITLE", "SEARCH_QUERY", "getSEARCH_QUERY", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSEARCH_QUERY() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getEXTRA_TITLE() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getEXTRA_RELEASE_DATE() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getEXTRA_POSTER_PATH() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}