package com.osapps.app.second.fraga.di

import com.osapps.app.dagger.scopes.PerFragment
import com.osapps.app.second.fraga.presenter.FragmentAPresenter
import com.osapps.app.second.fraga.view.FragmentA
import com.osapps.app.second.fraga.view.FragmentAView
import com.osapps.core.infrastructure.localrepository.LocalRepository
import dagger.Module
import dagger.Provides

/**
 * Created by osApps on 02/06/2017.
 */

/**
 * This module holds all of the instances related to DetailFragment.
 * In order to inject specific instance into the fragment, we need to:
 * [1] make sure that we provide all of the dependencies of the instance in this module (you can check
 * out AppModule's sharedPreferences initialization for a good example)
 * [2] the constructor of the implemented instance should annotate itself with @inject
 * [3] add the instance to the constructor of the instance
 */
@Module
@PerFragment
class FragmentAModule {

    @Provides
    internal fun provideFragmentAView(frag: FragmentA): FragmentAView = frag

    @Provides
    internal fun provideFragmentPresenter(view: FragmentAView, localRepository: LocalRepository): FragmentAPresenter
            = FragmentAPresenter(view,localRepository)

}
