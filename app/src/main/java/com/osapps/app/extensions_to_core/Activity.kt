package com.osapps.app.extensions_to_core

import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.osapps.myapplication.R

/**
 * Created by osapps on 19/04/2018.
 */


//fragment replace
fun AppCompatActivity.replaceFragment(tag: String, layoutId: Int, newInstance: () -> Fragment) {
    val fragment = supportFragmentManager.findFragmentByTag(tag) ?: newInstance()
    supportFragmentManager.beginTransaction()
            .replace(layoutId, fragment, tag)
            .commit()
}


//fragment add to back stack todo: zvi says no good!
fun AppCompatActivity.addFragmentBackStack(tag: String, layoutId: Int, newInstance: () -> Fragment) {
    val fragment = supportFragmentManager.findFragmentByTag(tag) ?: newInstance()
    supportFragmentManager.beginTransaction()
            .replace(layoutId, fragment, tag)
            .addToBackStack(tag)
            .commit()
}