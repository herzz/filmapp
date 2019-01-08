package com.zahirherz.sample.filmapp.model;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.RxRoom;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import io.reactivex.Observable;
import java.lang.Boolean;
import java.lang.Exception;
import java.lang.Float;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings("unchecked")
public final class MovieDao_Impl implements MovieDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfMovie;

  private final IntegerListTypeConverter __integerListTypeConverter = new IntegerListTypeConverter();

  private final SharedSQLiteStatement __preparedStmtOfDelete;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public MovieDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMovie = new EntityInsertionAdapter<Movie>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `movie_table`(`id`,`voteCount`,`video`,`vote_count`,`title`,`popularity`,`posterPath`,`originalLanguage`,`originalTitle`,`genreIds`,`backdropPath`,`adult`,`overview`,`release_date`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Movie value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getVoteCount() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, value.getVoteCount());
        }
        final Integer _tmp;
        _tmp = value.getVideo() == null ? null : (value.getVideo() ? 1 : 0);
        if (_tmp == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindLong(3, _tmp);
        }
        if (value.getVoteAverage() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindDouble(4, value.getVoteAverage());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getTitle());
        }
        if (value.getPopularity() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindDouble(6, value.getPopularity());
        }
        if (value.getPosterPath() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getPosterPath());
        }
        if (value.getOriginalLanguage() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getOriginalLanguage());
        }
        if (value.getOriginalTitle() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getOriginalTitle());
        }
        final String _tmp_1;
        _tmp_1 = __integerListTypeConverter.integertListToString(value.getGenreIds());
        if (_tmp_1 == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, _tmp_1);
        }
        if (value.getBackdropPath() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getBackdropPath());
        }
        final Integer _tmp_2;
        _tmp_2 = value.getAdult() == null ? null : (value.getAdult() ? 1 : 0);
        if (_tmp_2 == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindLong(12, _tmp_2);
        }
        if (value.getOverview() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getOverview());
        }
        if (value.getReleaseDate() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getReleaseDate());
        }
      }
    };
    this.__preparedStmtOfDelete = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM movie_table WHERE id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM movie_table";
        return _query;
      }
    };
  }

  @Override
  public void insert(Movie movie) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfMovie.insert(movie);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(Integer id) {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDelete.acquire();
    __db.beginTransaction();
    try {
      int _argIndex = 1;
      if (id == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindLong(_argIndex, id);
      }
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDelete.release(_stmt);
    }
  }

  @Override
  public void deleteAll() {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAll.release(_stmt);
    }
  }

  @Override
  public Observable<List<Movie>> getAll() {
    final String _sql = "SELECT * FROM movie_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createObservable(__db, new String[]{"movie_table"}, new Callable<List<Movie>>() {
      @Override
      public List<Movie> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
          final int _cursorIndexOfVoteCount = _cursor.getColumnIndexOrThrow("voteCount");
          final int _cursorIndexOfVideo = _cursor.getColumnIndexOrThrow("video");
          final int _cursorIndexOfVoteAverage = _cursor.getColumnIndexOrThrow("vote_count");
          final int _cursorIndexOfTitle = _cursor.getColumnIndexOrThrow("title");
          final int _cursorIndexOfPopularity = _cursor.getColumnIndexOrThrow("popularity");
          final int _cursorIndexOfPosterPath = _cursor.getColumnIndexOrThrow("posterPath");
          final int _cursorIndexOfOriginalLanguage = _cursor.getColumnIndexOrThrow("originalLanguage");
          final int _cursorIndexOfOriginalTitle = _cursor.getColumnIndexOrThrow("originalTitle");
          final int _cursorIndexOfGenreIds = _cursor.getColumnIndexOrThrow("genreIds");
          final int _cursorIndexOfBackdropPath = _cursor.getColumnIndexOrThrow("backdropPath");
          final int _cursorIndexOfAdult = _cursor.getColumnIndexOrThrow("adult");
          final int _cursorIndexOfOverview = _cursor.getColumnIndexOrThrow("overview");
          final int _cursorIndexOfReleaseDate = _cursor.getColumnIndexOrThrow("release_date");
          final List<Movie> _result = new ArrayList<Movie>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Movie _item;
            _item = new Movie();
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            _item.setId(_tmpId);
            final Integer _tmpVoteCount;
            if (_cursor.isNull(_cursorIndexOfVoteCount)) {
              _tmpVoteCount = null;
            } else {
              _tmpVoteCount = _cursor.getInt(_cursorIndexOfVoteCount);
            }
            _item.setVoteCount(_tmpVoteCount);
            final Boolean _tmpVideo;
            final Integer _tmp;
            if (_cursor.isNull(_cursorIndexOfVideo)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(_cursorIndexOfVideo);
            }
            _tmpVideo = _tmp == null ? null : _tmp != 0;
            _item.setVideo(_tmpVideo);
            final Float _tmpVoteAverage;
            if (_cursor.isNull(_cursorIndexOfVoteAverage)) {
              _tmpVoteAverage = null;
            } else {
              _tmpVoteAverage = _cursor.getFloat(_cursorIndexOfVoteAverage);
            }
            _item.setVoteAverage(_tmpVoteAverage);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            _item.setTitle(_tmpTitle);
            final Float _tmpPopularity;
            if (_cursor.isNull(_cursorIndexOfPopularity)) {
              _tmpPopularity = null;
            } else {
              _tmpPopularity = _cursor.getFloat(_cursorIndexOfPopularity);
            }
            _item.setPopularity(_tmpPopularity);
            final String _tmpPosterPath;
            _tmpPosterPath = _cursor.getString(_cursorIndexOfPosterPath);
            _item.setPosterPath(_tmpPosterPath);
            final String _tmpOriginalLanguage;
            _tmpOriginalLanguage = _cursor.getString(_cursorIndexOfOriginalLanguage);
            _item.setOriginalLanguage(_tmpOriginalLanguage);
            final String _tmpOriginalTitle;
            _tmpOriginalTitle = _cursor.getString(_cursorIndexOfOriginalTitle);
            _item.setOriginalTitle(_tmpOriginalTitle);
            final List<Integer> _tmpGenreIds;
            final String _tmp_1;
            _tmp_1 = _cursor.getString(_cursorIndexOfGenreIds);
            _tmpGenreIds = __integerListTypeConverter.stringToIntegertList(_tmp_1);
            _item.setGenreIds(_tmpGenreIds);
            final String _tmpBackdropPath;
            _tmpBackdropPath = _cursor.getString(_cursorIndexOfBackdropPath);
            _item.setBackdropPath(_tmpBackdropPath);
            final Boolean _tmpAdult;
            final Integer _tmp_2;
            if (_cursor.isNull(_cursorIndexOfAdult)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getInt(_cursorIndexOfAdult);
            }
            _tmpAdult = _tmp_2 == null ? null : _tmp_2 != 0;
            _item.setAdult(_tmpAdult);
            final String _tmpOverview;
            _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
            _item.setOverview(_tmpOverview);
            final String _tmpReleaseDate;
            _tmpReleaseDate = _cursor.getString(_cursorIndexOfReleaseDate);
            _item.setReleaseDate(_tmpReleaseDate);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
