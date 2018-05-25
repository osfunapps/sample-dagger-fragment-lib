package com.osapps.app.second.view

import android.os.Bundle


import javax.inject.Inject

import dagger.android.support.DaggerAppCompatActivity
import android.support.v4.app.FragmentManager
import com.osapps.app.extensions_to_core.addFragmentBackStack
import com.osapps.app.extensions_to_core.replaceFragment
import com.osapps.app.second.fraga.view.FragmentA
import com.osapps.app.second.presentation.FragmentActivityPresenter
import com.osapps.myapplication.R


class FragmentActivity : DaggerAppCompatActivity(), FragmentActivityView{

    fun supportFragmentManager(): FragmentManager = supportFragmentManager

    @Inject
    lateinit var presenter: FragmentActivityPresenter




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)
        onViewReady()
    }






    override fun onViewReady() {
        replaceFragment("fragment_a", R.id.fragment_container) {
            FragmentA.newInstance()
        }

    }

}
