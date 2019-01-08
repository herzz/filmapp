package com.zahirherz.sample.filmapp.add

import com.zahirherz.sample.filmapp.model.Movie
import com.zahirherz.sample.filmapp.model.LocalDataSource

class AddFilmPresenter(private var viewInterface: AddFilmContract.ViewInterface, private var dataSource: LocalDataSource) : AddFilmContract.PresenterInterface {

  override fun addMovie(title: String, releaseDate: String, posterPath: String) {
    if (title.isEmpty()) {
      viewInterface.displayError("Title cannot be empty.")
    } else {
      val movie = Movie(title, releaseDate, posterPath)
      dataSource.insert(movie)
      viewInterface.returnToMain()
    }
  }
}
