package com.zahirherz.sample.filmapp.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001fB\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u001c\u0010\u0017\u001a\u00020\u00182\n\u0010\u0019\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0016H\u0016J\u001c\u0010\u001b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0016H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006 "}, d2 = {"Lcom/zahirherz/sample/filmapp/main/MainAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/zahirherz/sample/filmapp/main/MainAdapter$MoviesHolder;", "movieList", "", "Lcom/zahirherz/sample/filmapp/model/Movie;", "context", "Landroid/content/Context;", "(Ljava/util/List;Landroid/content/Context;)V", "getContext$app_debug", "()Landroid/content/Context;", "setContext$app_debug", "(Landroid/content/Context;)V", "getMovieList$app_debug", "()Ljava/util/List;", "setMovieList$app_debug", "(Ljava/util/List;)V", "selectedMovies", "Ljava/util/HashSet;", "getSelectedMovies", "()Ljava/util/HashSet;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "MoviesHolder", "app_debug"})
public final class MainAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.zahirherz.sample.filmapp.main.MainAdapter.MoviesHolder> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.HashSet<com.zahirherz.sample.filmapp.model.Movie> selectedMovies = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<? extends com.zahirherz.sample.filmapp.model.Movie> movieList;
    @org.jetbrains.annotations.NotNull()
    private android.content.Context context;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.HashSet<com.zahirherz.sample.filmapp.model.Movie> getSelectedMovies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.zahirherz.sample.filmapp.main.MainAdapter.MoviesHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.zahirherz.sample.filmapp.main.MainAdapter.MoviesHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.zahirherz.sample.filmapp.model.Movie> getMovieList$app_debug() {
        return null;
    }
    
    public final void setMovieList$app_debug(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.zahirherz.sample.filmapp.model.Movie> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext$app_debug() {
        return null;
    }
    
    public final void setContext$app_debug(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    public MainAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.zahirherz.sample.filmapp.model.Movie> movieList, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0012X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016\u00a8\u0006\u001a"}, d2 = {"Lcom/zahirherz/sample/filmapp/main/MainAdapter$MoviesHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "v", "Landroid/view/View;", "(Lcom/zahirherz/sample/filmapp/main/MainAdapter;Landroid/view/View;)V", "checkBox", "Landroid/widget/CheckBox;", "getCheckBox$app_debug", "()Landroid/widget/CheckBox;", "setCheckBox$app_debug", "(Landroid/widget/CheckBox;)V", "movieImageView", "Landroid/widget/ImageView;", "getMovieImageView$app_debug", "()Landroid/widget/ImageView;", "setMovieImageView$app_debug", "(Landroid/widget/ImageView;)V", "releaseDateTextView", "Landroid/widget/TextView;", "getReleaseDateTextView$app_debug", "()Landroid/widget/TextView;", "setReleaseDateTextView$app_debug", "(Landroid/widget/TextView;)V", "titleTextView", "getTitleTextView$app_debug", "setTitleTextView$app_debug", "app_debug"})
    public final class MoviesHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView titleTextView;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView releaseDateTextView;
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageView movieImageView;
        @org.jetbrains.annotations.NotNull()
        private android.widget.CheckBox checkBox;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTitleTextView$app_debug() {
            return null;
        }
        
        public final void setTitleTextView$app_debug(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getReleaseDateTextView$app_debug() {
            return null;
        }
        
        public final void setReleaseDateTextView$app_debug(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getMovieImageView$app_debug() {
            return null;
        }
        
        public final void setMovieImageView$app_debug(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.CheckBox getCheckBox$app_debug() {
            return null;
        }
        
        public final void setCheckBox$app_debug(@org.jetbrains.annotations.NotNull()
        android.widget.CheckBox p0) {
        }
        
        public MoviesHolder(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
            super(null);
        }
    }
}