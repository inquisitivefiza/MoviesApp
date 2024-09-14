package com.example.movies.movieList.presentation

import androidx.lifecycle.ViewModel
import com.example.movies.movieList.domain.model.Movie

data class MovieListState (
     val isLoading:Boolean =false,
     val popularMovieListPage: Int=1,
     val upcomingMovieListPage: Int=1,

     val isCurrentPopularScreen: Boolean=true,
     val popularMovieList:List<Movie> = emptyList(),
    val upcomingMovieList:List<Movie> = emptyList()
 ):ViewModel()
{

 }