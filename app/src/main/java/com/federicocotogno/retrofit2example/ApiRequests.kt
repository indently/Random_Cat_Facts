package com.federicocotogno.retrofit2example

import com.federicocotogno.retrofit2example.api.RandomCatFacts
import retrofit2.Call
import retrofit2.http.GET

interface ApiRequests {

    @GET("/facts/random")
    fun getCatFacts(): Call<RandomCatFacts>
}