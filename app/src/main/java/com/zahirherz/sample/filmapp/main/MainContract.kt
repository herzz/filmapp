package com.zahirherz.sample.filmapp.main

import com.zahirherz.sample.filmapp.model.Movie

import java.util.HashSet

class MainContract {

  interface PresenterInterface {
    fun getMyMoviesList()
    fun onDelete(selectedMovies: HashSet<Movie>)
    fun stop()
  }

  interface ViewInterface {
    fun displayMovies(movieList: List<Movie>)
    fun displayNoMovies()
    fun displayMessage(message: String)
    fun displayError(message: String)
  }

}
