package com.zahirherz.sample.filmapp.main

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.zahirherz.sample.filmapp.R
import com.zahirherz.sample.filmapp.add.AddFilmActivity
import com.zahirherz.sample.filmapp.model.Movie
import com.zahirherz.sample.filmapp.model.LocalDataSource

class MainActivity : AppCompatActivity(), MainContract.ViewInterface {

  private lateinit var moviesRecyclerView: RecyclerView
  private lateinit var adapter: MainAdapter
  private lateinit var fab: FloatingActionButton
  private lateinit var toolbar: Toolbar
  private lateinit var noMoviesTextView: TextView

  private lateinit var mainPresenter: MainContract.PresenterInterface

  private val TAG = "MainActivity"

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    setupPresenter()
    setupViews()
  }

  override fun onStart() {
    super.onStart()
    mainPresenter.getMyMoviesList()
  }

  override fun onStop() {
    super.onStop()
    mainPresenter.stop()
  }

  private fun setupPresenter() {
    val dataSource = LocalDataSource(application)
    mainPresenter = MainPresenter(this, dataSource)
  }

  private fun setupViews() {
    moviesRecyclerView = findViewById(R.id.moviesRecyclerView)
    moviesRecyclerView.layoutManager = LinearLayoutManager(this)
    adapter = MainAdapter(arrayListOf(), this@MainActivity)
    moviesRecyclerView.adapter = adapter
    fab = findViewById(R.id.fab)
    noMoviesTextView = findViewById(R.id.no_movies_textview)
    toolbar = findViewById(R.id.toolbar)
    setSupportActionBar(toolbar)
    supportActionBar?.title = "Must watch List"
  }

  override fun displayMovies(movieList: List<Movie>) {
    adapter.movieList = movieList
    adapter.notifyDataSetChanged()

    moviesRecyclerView.visibility = VISIBLE
    noMoviesTextView.visibility = INVISIBLE
  }

  override fun displayNoMovies() {
    Log.d(TAG, "No movies to display.")

    moviesRecyclerView.visibility = INVISIBLE
    noMoviesTextView.visibility = VISIBLE
  }

  //fab onClick
  fun goToAddFilmActivity(v: View) {
    val myIntent = Intent(this@MainActivity, AddFilmActivity::class.java)
    startActivityForResult(myIntent, ADD_MOVIE_ACTIVITY_REQUEST_CODE)
  }

  override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
    super.onActivityResult(requestCode, resultCode, data)
    if (requestCode == ADD_MOVIE_ACTIVITY_REQUEST_CODE && resultCode == Activity.RESULT_OK) {
      displayMessage("Film successfully added.")
    } else {
      displayError("Film could not be added.")
    }
  }

  override fun onCreateOptionsMenu(menu: Menu): Boolean {
    menuInflater.inflate(R.menu.main, menu)
    return true
  }

  override fun onOptionsItemSelected(item: MenuItem): Boolean {
    if (item.itemId == R.id.deleteMenuItem) {
      mainPresenter.onDelete(adapter.selectedMovies)
    }

    return super.onOptionsItemSelected(item)
  }

  override fun displayMessage(message: String) {
    Toast.makeText(this@MainActivity, message, Toast.LENGTH_LONG).show()
  }

  override fun displayError(message: String) {
    displayMessage(message)
  }

  companion object {
    const val ADD_MOVIE_ACTIVITY_REQUEST_CODE = 1
  }

}