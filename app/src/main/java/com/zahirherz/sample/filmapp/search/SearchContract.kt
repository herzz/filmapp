package com.zahirherz.sample.filmapp.search

import com.zahirherz.sample.filmapp.model.TmdbResponse

class SearchContract {

  interface PresenterInterface {

    fun getSearchResults(query: String)
    fun stop()
  }

  interface ViewInterface {

    fun displayResult(tmdbResponse: TmdbResponse)
    fun displayMessage(message: String)
    fun displayError(message: String)
  }
}
