package com.osapps.app.dagger

import android.app.Application
import com.osapps.app.dagger.scopes.AppScope
import com.osapps.core.di.CoreComponent
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import dagger.android.support.DaggerApplication

@AppScope
@Component(dependencies = [CoreComponent::class],
        modules = [AndroidSupportInjectionModule::class, ActivityBuilder::class])
interface AppComponent: AndroidInjector<DaggerApplication> {

    //a generic builder
    override fun inject(instance: DaggerApplication)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder
        fun coreComponent(coreComponent: CoreComponent): Builder
        fun build(): AppComponent
    }


}