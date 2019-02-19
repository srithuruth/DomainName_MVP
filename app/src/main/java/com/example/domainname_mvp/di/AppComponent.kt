package com.example.domainname_mvp.di

import com.example.domainname_mvp.network.DomainService
import dagger.Component
import javax.inject.Singleton

@Component(modules = [NetworkModule::class])
@Singleton

interface AppComponent{
    fun domainService(): DomainService
}