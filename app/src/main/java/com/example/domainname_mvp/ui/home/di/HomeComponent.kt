package com.example.domainname_mvp.ui.home.di

import com.example.domainname_mvp.di.AppComponent
import dagger.Component

@Component(dependencies = [AppComponent::class], modules = [HomeModule::class])
@HomeScope
interface HomeComponent{
    fun inject (mainActivity: MainActivity)
}