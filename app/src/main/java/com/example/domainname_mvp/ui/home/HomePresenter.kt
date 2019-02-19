package com.example.domainname_mvp.ui.home

import com.example.domainname_mvp.network.DomainService
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class HomePresenter(
    private val domainService: DomainService,
    private val view: HomeContract.View
) : HomeContract.Presenter {

    override fun getDomainDetail(domain: String) {
        compositeDisposable.add(domainService.getDomainDetail(domain.toString())
            .subscribeOn(Schedulers.io())
            .filter{!it.response.isNullOrEmpty()}
            .map{it.response}
            .flatMap{}
            .map{}
            .toList()
            .observeOn(AndroidSchedulers.mainThread())
            .subscibe({view.showResults(it)},
                {failure -> view.showError(failure?.message?: "An unknown error happened")}))
    }

}