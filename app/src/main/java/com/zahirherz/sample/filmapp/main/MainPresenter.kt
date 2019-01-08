package com.zahirherz.sample.filmapp.main

import android.util.Log
import com.zahirherz.sample.filmapp.model.Movie
import com.zahirherz.sample.filmapp.model.LocalDataSource
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.annotations.NonNull
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableObserver
import io.reactivex.schedulers.Schedulers

import java.util.HashSet

class MainPresenter(private var viewInterface: MainContract.ViewInterface, private var dataSource: LocalDataSource) : MainContract.PresenterInterface {
  private val TAG = "MainPresenter"
  private val compositeDisposable = CompositeDisposable()

  val myMoviesObservable: Observable<List<Movie>>
    get() = dataSource.allMovies

  val observer: DisposableObserver<List<Movie>>
    get() = object : DisposableObserver<List<Movie>>() {

      override fun onNext(movieList: List<Movie>) {
        if (movieList == null || movieList.size == 0) {
          viewInterface.displayNoMovies()
        } else {
          viewInterface.displayMovies(movieList)
        }
      }

      override fun onError(@NonNull e: Throwable) {
        Log.e(TAG, "Error fetching movie list", e)
        viewInterface.displayError("Error fetching movie list")
      }

      override fun onComplete() {
        Log.d(TAG, "Completed")
      }
    }

  override fun getMyMoviesList() {
    val myMoviesDisposable = myMoviesObservable
        .subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
        .subscribeWith(observer)

    compositeDisposable.add(myMoviesDisposable)
  }


  override fun onDelete(selectedMovies: HashSet<Movie>) {
    for (movie in selectedMovies) {
      dataSource.delete(movie)
    }
    if (selectedMovies.size == 1) {
      viewInterface.displayMessage("Film deleted.")
    } else if (selectedMovies.size > 1) {
      viewInterface.displayMessage("Films deleted.")
    }
  }

  override fun stop() {
    compositeDisposable.clear()
  }

}
