package com.jacob.ramilo.whitelabelapp.di

import com.jacob.ramilo.whitelabelapp.network.BaseApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {

    companion object {
        private const val baseURL = ""
    }

    @Provides
    @Singleton
    fun provideBaseApiService(): BaseApiService {
        return Retrofit.Builder()
            .baseUrl(baseURL)
            .build()
            .create(BaseApiService::class.java)
    }

}