package com.example.domainname_mvp.ui.home

import retrofit2.Response

interface HomeContract{
    interface View{
        fun showResults(results: List<Response>)
        fun showError(message: String)
            }
    interface Presenter{
        fun getDomainDetail(domain: String)
    }
}