package com.osapps.app.main.presentation


import com.osapps.core.infrastructure.localrepository.LocalRepository
import com.osapps.app.main.view.OsAppsActivityView
import javax.inject.Inject


class OsAppsActivityPresenterImpl @Inject constructor(private var view: OsAppsActivityView,
                                                      private var localRepository: LocalRepository){


    fun viewReady() {
        println(localRepository)
    }

}
