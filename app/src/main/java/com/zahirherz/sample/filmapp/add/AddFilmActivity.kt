package com.zahirherz.sample.filmapp.add

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

import com.zahirherz.sample.filmapp.R
import com.zahirherz.sample.filmapp.network.RetrofitClient.TMDB_IMAGEURL
import com.zahirherz.sample.filmapp.search.SearchActivity
import com.zahirherz.sample.filmapp.model.LocalDataSource
import com.squareup.picasso.Picasso

class AddFilmActivity : AppCompatActivity(), AddFilmContract.ViewInterface {
  private lateinit var titleEditText: EditText
  private lateinit var releaseDateEditText: EditText
  private lateinit var movieImageView: ImageView
  private lateinit var addFilmPresenter: AddFilmContract.PresenterInterface

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_add_film)

    setupPresenter()
    setupViews()
  }

  fun setupPresenter() {
    val dataSource = LocalDataSource(application)
    addFilmPresenter = AddFilmPresenter(this, dataSource)
  }

  fun setupViews() {
    titleEditText = findViewById(R.id.film_title)
    releaseDateEditText = findViewById(R.id.release_date)
    movieImageView = findViewById(R.id.film_imageview)
  }

  //search onClick
  fun goToSearchFilmActivity(v: View) {
    val title = titleEditText.text.toString()
    val intent = Intent(this@AddFilmActivity, SearchActivity::class.java)
    intent.putExtra(SearchActivity.SEARCH_QUERY, title)
    startActivityForResult(intent, SEARCH_MOVIE_ACTIVITY_REQUEST_CODE)
  }

  //addMovie onClick
  fun onClickAddFilm(view: View) {
    val title = titleEditText.text.toString()
    val releaseDate = releaseDateEditText.text.toString()
    val posterPath = if (movieImageView.tag != null) movieImageView.tag.toString() else ""

    addFilmPresenter.addMovie(title, releaseDate, posterPath)

  }

  override fun returnToMain() {
    setResult(Activity.RESULT_OK)
    finish()
  }

  override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
    super.onActivityResult(requestCode, resultCode, data)

    this@AddFilmActivity.runOnUiThread {
      titleEditText.setText(data?.getStringExtra(SearchActivity.EXTRA_TITLE))
      releaseDateEditText.setText(data?.getStringExtra(SearchActivity.EXTRA_RELEASE_DATE))
      movieImageView.tag = data?.getStringExtra(SearchActivity.EXTRA_POSTER_PATH)
      Picasso.get().load(TMDB_IMAGEURL + data?.getStringExtra(SearchActivity.EXTRA_POSTER_PATH)).into(movieImageView)
    }
  }

  override fun displayMessage(message: String) {
    Toast.makeText(this@AddFilmActivity, message, Toast.LENGTH_LONG).show()
  }

  override fun displayError(message: String) {
    displayMessage(message)
  }

  companion object {
    const val SEARCH_MOVIE_ACTIVITY_REQUEST_CODE = 2
  }
}
