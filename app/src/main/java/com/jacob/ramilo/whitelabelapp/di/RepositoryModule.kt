package com.jacob.ramilo.whitelabelapp.di

import com.jacob.ramilo.whitelabelapp.repository.BaseRepository
import com.jacob.ramilo.whitelabelapp.repository.DefaultRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import javax.inject.Singleton

@Module
@InstallIn(ViewModelComponent::class)
class RepositoryModule {

    @Provides
    @Singleton
    fun provideDefaultRepository(): BaseRepository {
        return DefaultRepository()
    }

}