package com.android.assignment6.data.database;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import com.android.assignment6.data.model.BaseAppResponse;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class BaseAppDao_Impl implements BaseAppDao {
  private final RoomDatabase __db;

  public BaseAppDao_Impl(RoomDatabase __db) {
    this.__db = __db;
  }

  @Override
  public BaseAppResponse getAllDataInTable() {
    final String _sql = "SELECT * FROM cereal_table ORDER BY dbId DESC LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfDbId = CursorUtil.getColumnIndexOrThrow(_cursor, "dbId");
      final int _cursorIndexOfResponse = CursorUtil.getColumnIndexOrThrow(_cursor, "response");
      final BaseAppResponse _result;
      if(_cursor.moveToFirst()) {
        final long _tmpDbId;
        _tmpDbId = _cursor.getLong(_cursorIndexOfDbId);
        final String _tmpResponse;
        if (_cursor.isNull(_cursorIndexOfResponse)) {
          _tmpResponse = null;
        } else {
          _tmpResponse = _cursor.getString(_cursorIndexOfResponse);
        }
        _result = new BaseAppResponse(_tmpDbId,_tmpResponse);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
