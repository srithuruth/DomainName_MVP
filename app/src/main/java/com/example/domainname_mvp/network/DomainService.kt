package com.example.domainname_mvp.network

interface DomainService{
    @GET(DOMAIN_ENDPOINT)
    fun getDomainDetail(@Query()latitude: Float): Observable<Response>
}