package com.osapps.app.second.fraga.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.osapps.app.second.fraga.presenter.FragmentAPresenter
import com.osapps.myapplication.R
import dagger.android.support.DaggerFragment
import javax.inject.Inject


/**
 * Created by osApps on 02/06/2017.
 */

class FragmentA : DaggerFragment(), FragmentAView{

    @Inject
    lateinit var presenter: FragmentAPresenter


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
            = inflater.inflate(R.layout.fragment_a, container, false)

    override fun onViewReady() {
        presenter.doStuff()
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onViewReady()
    }


    companion object {
        fun newInstance(): FragmentA = FragmentA()
    }
}
