package com.android.assignment6.data.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'\u00a8\u0006\u0004"}, d2 = {"Lcom/android/assignment6/data/database/BaseAppDao;", "", "getAllDataInTable", "Lcom/android/assignment6/data/model/BaseAppResponse;", "app_dummyDebug"})
public abstract interface BaseAppDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM cereal_table ORDER BY dbId DESC LIMIT 1")
    public abstract com.android.assignment6.data.model.BaseAppResponse getAllDataInTable();
}