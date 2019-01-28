package com.api.taufik.myapi2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val retrofit = Retrofit.Builder()
            .baseUrl("http://hbcdepok.com")
            .client(OkHttpClient())
            .addConverterFactory(GsonConverterFactory.create())
            //        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()

        val service = retrofit.create(getApiService::class.java)
        val call = service?.getAllPost()
        call?.enqueue(object : Callback<data>{
            override fun onFailure(call: Call<data>, t: Throwable) {
               Toast.makeText(applicationContext, "JSON GAGAL",Toast.LENGTH_LONG).show()
            }

            override fun onResponse(call: Call<data>, response: Response<data>) {
                val body = response?.body()
                val data  = body?.data
                val size = data?.size
            }

        })
    }
}
