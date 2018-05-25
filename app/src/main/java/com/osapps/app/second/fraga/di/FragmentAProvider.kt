package com.osapps.app.second.fraga.di

import com.osapps.app.second.fraga.view.FragmentA

import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by osApps on 02/06/2017.
 */
@Module
abstract class FragmentAProvider {
    @ContributesAndroidInjector(modules = [FragmentAModule::class]) //the specific module of the fragment
    internal abstract fun provideFragmentA(): FragmentA
}
