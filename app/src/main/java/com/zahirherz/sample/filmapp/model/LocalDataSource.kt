package com.zahirherz.sample.filmapp.model

import android.app.Application
import io.reactivex.Observable
import io.reactivex.schedulers.Schedulers
import io.reactivex.Completable

open class LocalDataSource(application: Application) {

  private val movieDao: MovieDao
  open val allMovies: Observable<List<Movie>>

  init {
    val db = LocalDatabase.getInstance(application)
    movieDao = db.movieDao()
    allMovies = movieDao.all
  }


  fun insert(movie: Movie) {
    Completable.fromAction {
      movieDao.insert(movie)
    }.subscribeOn(Schedulers.io()).subscribe()
  }

  fun delete(movie: Movie) {
    Completable.fromAction {
      movieDao.delete(movie.id)
    }.subscribeOn(Schedulers.io()).subscribe()
  }

}