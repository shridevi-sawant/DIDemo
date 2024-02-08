package com.capgemini.didemo

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Qualifier


@Module
@InstallIn(ActivityComponent::class)
object EngineModule {


    @Provides
    fun getAutoEngine(): Engine{
        return Engine("Auto")
    }


}