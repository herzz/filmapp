package com.zahirherz.sample.filmapp.model;

import java.lang.System;

@androidx.room.Database(entities = {com.zahirherz.sample.filmapp.model.Movie.class}, version = 1)
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/zahirherz/sample/filmapp/model/LocalDatabase;", "Landroidx/room/RoomDatabase;", "()V", "movieDao", "Lcom/zahirherz/sample/filmapp/model/MovieDao;", "Companion", "app_debug"})
public abstract class LocalDatabase extends androidx.room.RoomDatabase {
    private static volatile com.zahirherz.sample.filmapp.model.LocalDatabase INSTANCE;
    public static final com.zahirherz.sample.filmapp.model.LocalDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.zahirherz.sample.filmapp.model.MovieDao movieDao();
    
    public LocalDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/zahirherz/sample/filmapp/model/LocalDatabase$Companion;", "", "()V", "INSTANCE", "Lcom/zahirherz/sample/filmapp/model/LocalDatabase;", "getInstance", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.zahirherz.sample.filmapp.model.LocalDatabase getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}