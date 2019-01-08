package com.zahirherz.sample.filmapp.network

import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
  const val API_KEY = "1237973a9fb04563d2fce6ce4713f1a1"
  const val TMDB_BASE_URL = "http://api.themoviedb.org/3/"
  const val TMDB_IMAGEURL = "https://image.tmdb.org/t/p/w500/"

  val moviesApi = Retrofit.Builder()
      .baseUrl(TMDB_BASE_URL)
      .addConverterFactory(GsonConverterFactory.create())
      .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
      .build()
      .create(RetrofitInterface::class.java)
}