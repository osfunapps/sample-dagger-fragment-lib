package com.osapps.app.dagger

import com.osapps.app.main.di.OsAppsActivityModule
import com.osapps.app.main.view.OsAppsActivity
import com.osapps.app.dagger.scopes.PerActivity
import com.osapps.app.second.view.FragmentActivity
import com.osapps.app.second.di.FragmentActivityModule
import com.osapps.app.second.fraga.di.FragmentAProvider
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by osapps on 03/05/2018.
 */

/*
 * A module meant to:
 * 1) connect the application module with it's corresponding activities
 * 2) state which modules each app should use
 *
 * Every activity should be declared here, with at least one module.
*/

@PerActivity
@Module
abstract class ActivityBuilder {


    @PerActivity
    @ContributesAndroidInjector(modules = [
        OsAppsActivityModule::class
    ])
    internal abstract fun bindOsAppsActivity(): OsAppsActivity


    /**
     * this is an example of activity which carries one fragment. Notice that in addition to the activity
     * module, we also included the specific fragment provider (which holds all of the fragment modules)
     */
    @PerActivity
    @ContributesAndroidInjector(modules = [
        FragmentActivityModule::class,  //the activity module
        FragmentAProvider::class    //fragment A module
    ])
    internal abstract fun bindMainActivity(): FragmentActivity

}


