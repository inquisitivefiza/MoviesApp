package com.example.movies.di

import com.example.movies.movieList.data.MovieListRepositoryImpl
import com.example.movies.movieList.domain.repository.MovieListRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
 abstract class RepositoryModule {
     @Binds
     @Singleton
     abstract fun bindMovieListRepository(
         movieListRepository: MovieListRepositoryImpl
     ):MovieListRepository

}