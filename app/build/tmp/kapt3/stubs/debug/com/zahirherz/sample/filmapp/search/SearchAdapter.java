package com.zahirherz.sample.filmapp.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001#B#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0019J\b\u0010\u001a\u001a\u00020\u0019H\u0016J\u001c\u0010\u001b\u001a\u00020\u001c2\n\u0010\u001d\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0019H\u0016J\u001c\u0010\u001f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0019H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006$"}, d2 = {"Lcom/zahirherz/sample/filmapp/search/SearchAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/zahirherz/sample/filmapp/search/SearchAdapter$SearchMoviesHolder;", "movieList", "", "Lcom/zahirherz/sample/filmapp/model/Movie;", "context", "Landroid/content/Context;", "listener", "Lcom/zahirherz/sample/filmapp/search/SearchActivity$RecyclerItemListener;", "(Ljava/util/List;Landroid/content/Context;Lcom/zahirherz/sample/filmapp/search/SearchActivity$RecyclerItemListener;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getListener", "()Lcom/zahirherz/sample/filmapp/search/SearchActivity$RecyclerItemListener;", "setListener", "(Lcom/zahirherz/sample/filmapp/search/SearchActivity$RecyclerItemListener;)V", "getMovieList", "()Ljava/util/List;", "setMovieList", "(Ljava/util/List;)V", "getItemAtPosition", "pos", "", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "SearchMoviesHolder", "app_debug"})
public final class SearchAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.zahirherz.sample.filmapp.search.SearchAdapter.SearchMoviesHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<? extends com.zahirherz.sample.filmapp.model.Movie> movieList;
    @org.jetbrains.annotations.NotNull()
    private android.content.Context context;
    @org.jetbrains.annotations.NotNull()
    private com.zahirherz.sample.filmapp.search.SearchActivity.RecyclerItemListener listener;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.zahirherz.sample.filmapp.search.SearchAdapter.SearchMoviesHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.zahirherz.sample.filmapp.search.SearchAdapter.SearchMoviesHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.zahirherz.sample.filmapp.model.Movie getItemAtPosition(int pos) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.zahirherz.sample.filmapp.model.Movie> getMovieList() {
        return null;
    }
    
    public final void setMovieList(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.zahirherz.sample.filmapp.model.Movie> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.zahirherz.sample.filmapp.search.SearchActivity.RecyclerItemListener getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.NotNull()
    com.zahirherz.sample.filmapp.search.SearchActivity.RecyclerItemListener p0) {
    }
    
    public SearchAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.zahirherz.sample.filmapp.model.Movie> movieList, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.zahirherz.sample.filmapp.search.SearchActivity.RecyclerItemListener listener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010\u00a8\u0006\u0017"}, d2 = {"Lcom/zahirherz/sample/filmapp/search/SearchAdapter$SearchMoviesHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "v", "Landroid/view/View;", "(Lcom/zahirherz/sample/filmapp/search/SearchAdapter;Landroid/view/View;)V", "movieImageView", "Landroid/widget/ImageView;", "getMovieImageView", "()Landroid/widget/ImageView;", "setMovieImageView", "(Landroid/widget/ImageView;)V", "overviewTextView", "Landroid/widget/TextView;", "getOverviewTextView", "()Landroid/widget/TextView;", "setOverviewTextView", "(Landroid/widget/TextView;)V", "releaseDateTextView", "getReleaseDateTextView", "setReleaseDateTextView", "titleTextView", "getTitleTextView", "setTitleTextView", "app_debug"})
    public final class SearchMoviesHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView titleTextView;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView overviewTextView;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView releaseDateTextView;
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageView movieImageView;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTitleTextView() {
            return null;
        }
        
        public final void setTitleTextView(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getOverviewTextView() {
            return null;
        }
        
        public final void setOverviewTextView(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getReleaseDateTextView() {
            return null;
        }
        
        public final void setReleaseDateTextView(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getMovieImageView() {
            return null;
        }
        
        public final void setMovieImageView(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView p0) {
        }
        
        public SearchMoviesHolder(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
            super(null);
        }
    }
}