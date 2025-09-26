package com.awesomeapp.audio.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.audio.Viewmodel48_1
import com.awesomeapp.audio.Activity48_2
import com.awesomeapp.audio.Activity48_3
import com.awesomeapp.audio.Fragment48_4
import com.awesomeapp.audio.Repository48_5
import com.awesomeapp.todo.Api36_6
import com.awesomeapp.forecast.Api40_6
import com.awesomeapp.timer.Api32_6
import com.awesomeapp.audio.Api48_6

@Module
@InstallIn(SingletonComponent::class)
object Module_48 {
    @Provides
    @Singleton
    fun provideRepository48_5(
        api0: Api36_6 = Api36_6(),
        api1: Api40_6 = Api40_6(),
        api2: Api32_6 = Api32_6()
    ): Repository48_5 {
        return Repository48_5(api0, 
        api1, 
        api2)
    }

    @Provides
    @Singleton
    fun provideApi48_6(): Api48_6 {
        return Api48_6()
    }
}