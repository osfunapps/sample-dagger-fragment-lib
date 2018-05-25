package com.osapps.app.main.view

import android.os.Bundle
import com.osapps.app.main.presentation.OsAppsActivityPresenterImpl
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject


class OsAppsActivity : DaggerAppCompatActivity(), OsAppsActivityView {

    @Inject lateinit var presenter: OsAppsActivityPresenterImpl

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter.viewReady()
    }

    override fun onPresenterReady() {
    }

}
