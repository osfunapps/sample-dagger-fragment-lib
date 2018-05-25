package com.osapps.app.main.di

import com.osapps.core.infrastructure.localrepository.LocalRepository
import com.osapps.app.main.presentation.OsAppsActivityPresenterImpl
import com.osapps.app.main.view.OsAppsActivity
import com.osapps.app.main.view.OsAppsActivityView
import com.osapps.app.dagger.scopes.PerActivity
import dagger.Module
import dagger.Provides

/**
 * Created by osapps on 03/05/2018.
 */

@Module
class OsAppsActivityModule {

    @Provides
    @PerActivity
    fun provideMainView(osAppsActivity: OsAppsActivity) : OsAppsActivityView = osAppsActivity

    @Provides
    @PerActivity
    fun provideMainPresenter(OsAppsActivityView: OsAppsActivity, localRepository: LocalRepository): OsAppsActivityPresenterImpl {
        return OsAppsActivityPresenterImpl(OsAppsActivityView, localRepository)
    }

}

