package com.zahirherz.sample.filmapp.search

import android.util.Log
import com.zahirherz.sample.filmapp.model.RemoteDataSource

import com.zahirherz.sample.filmapp.model.TmdbResponse

import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.annotations.NonNull
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableObserver
import io.reactivex.schedulers.Schedulers

class SearchPresenter(private var viewInterface: SearchContract.ViewInterface, private var dataSource: RemoteDataSource) : SearchContract.PresenterInterface {
  private val TAG = "SearchPresenter"
  private val compositeDisposable = CompositeDisposable()

  val searchResultsObservable: (String) -> Observable<TmdbResponse> = { query -> dataSource.searchResultsObservable(query) }

  val observer: DisposableObserver<TmdbResponse>
    get() = object : DisposableObserver<TmdbResponse>() {

      override fun onNext(@NonNull tmdbResponse: TmdbResponse) {
        Log.d(TAG, "OnNext" + tmdbResponse.totalResults)
        viewInterface.displayResult(tmdbResponse)
      }

      override fun onError(@NonNull e: Throwable) {
        Log.e(TAG,"Error fetching film data.", e)
        viewInterface.displayError("Error fetching film data.")
      }

      override fun onComplete() {
        Log.d(TAG, "Completed")
      }
    }

  override fun getSearchResults(query: String) {
    val searchResultsDisposable = searchResultsObservable(query)
        .subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
        .subscribeWith(observer)

    compositeDisposable.add(searchResultsDisposable)
  }

  override fun stop() {
    compositeDisposable.clear()
  }
}