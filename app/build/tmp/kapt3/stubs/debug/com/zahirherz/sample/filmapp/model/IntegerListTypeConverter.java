package com.zahirherz.sample.filmapp.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007J\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/zahirherz/sample/filmapp/model/IntegerListTypeConverter;", "", "()V", "integertListToString", "", "someObjects", "", "", "stringToIntegertList", "", "data", "app_debug"})
public final class IntegerListTypeConverter {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final java.util.List<java.lang.Integer> stringToIntegertList(@org.jetbrains.annotations.Nullable()
    java.lang.String data) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final java.lang.String integertListToString(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.Integer> someObjects) {
        return null;
    }
    
    public IntegerListTypeConverter() {
        super();
    }
}