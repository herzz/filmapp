package com.zahirherz.sample.filmapp.add

class AddFilmContract {
  interface PresenterInterface {
    fun addMovie(title: String, releaseDate: String, posterPath: String)
  }

  interface ViewInterface {
    fun returnToMain()
    fun displayMessage(message: String)
    fun displayError(message: String)
  }
}
