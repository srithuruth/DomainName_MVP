package com.example.domainname_mvp.ui.home

import android.app.Application
import com.example.domainname_mvp.di.AppComponent

class App : Application(){

    private lateinit var appComponet: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponet = DaggerAppComponent.builder()
            .build();
    }
    fun getComponent()=appComponet
}