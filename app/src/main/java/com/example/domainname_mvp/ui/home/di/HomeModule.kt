package com.example.domainname_mvp.ui.home.di

import com.example.domainname_mvp.ui.home.HomeContract
import dagger.Module
import dagger.Provides

@Module
class HomeModule(private val view: HomeContract.view)


@HomeScope
@Provides
fun provideHomePresenter(issService: ISSService)
        : HomeContract.Presenter {
    return HomePresenter(issService, view)