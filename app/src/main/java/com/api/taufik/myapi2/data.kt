package com.api.taufik.myapi2

import com.google.gson.annotations.SerializedName

data class data(
    @SerializedName("api_authorization")
    val apiAuthorization: String, // You are in debug mode !
    @SerializedName("api_http")
    val apiHttp: Int, // 200
    @SerializedName("api_message")
    val apiMessage: String, // success
    @SerializedName("api_status")
    val apiStatus: Int, // 1
    @SerializedName("data")
    val `data`: List<Data>
) {
    data class Data(
        @SerializedName("Nama")
        val nama: String, // achmad
        @SerializedName("No_STNK")
        val noSTNK: String, // 3671674178745858475
        @SerializedName("id")
        val id: Int // 1
    )
}