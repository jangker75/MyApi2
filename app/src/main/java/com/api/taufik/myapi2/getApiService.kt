package com.api.taufik.myapi2

import retrofit2.Call
import retrofit2.http.GET

interface getApiService {
    @GET("/data/public/api/list_member")
    fun getAllPost(): Call<data>
}