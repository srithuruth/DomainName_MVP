package com.example.domainname_mvp.ui.home.di

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.domainname_mvp.R
import retrofit2.Response

class DomainAdapter : RecyclerView.Adapter<DomainAdapter.DomainViewHolder>(){

    private val data = arrayListOf<okhttp3.Response>()

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): DomainAdapter.DomainViewHolder {
        val rootView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_pass, parent, false)
        return DomainViewHolder(rootView)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(position: DomainAdapter.DomainViewHolder, p1: Int) {
        RecyclerView.ViewHolder.bind(data[position])
    }





}