package com.osapps.app

import com.osapps.app.dagger.AppComponent
import com.osapps.app.dagger.DaggerAppComponent
import com.osapps.core.coreComponent
import com.osapps.core.initCoreDI
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

/**
 * Created by osapps on 21/05/2018.
 */

class App : DaggerApplication() {

    private lateinit var appComponent: AppComponent

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        initCoreDI(this)
        appComponent = DaggerAppComponent.builder().coreComponent(coreComponent).application(this).build()
        appComponent.inject(this)
        return appComponent
    }
}
