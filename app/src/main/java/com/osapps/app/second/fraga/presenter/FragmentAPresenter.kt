package com.osapps.app.second.fraga.presenter

import com.osapps.app.second.fraga.view.FragmentAView
import com.osapps.core.infrastructure.localrepository.LocalRepository

import javax.inject.Inject


/**
 * Created by osApps on 30/05/2017.
 */

class FragmentAPresenter @Inject constructor(private var view: FragmentAView,
                                             private var localRepository: LocalRepository) {
    fun doStuff() {
        println(localRepository)
    }


}
