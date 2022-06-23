package com.example.placesnearby.`interface`

import com.example.placesnearby.model.RestaurantsModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {

    //nearbysearch/json?location=23.0225,72.5714&radius=1000&type=restaurant&key=AIzaSyAymWBDEP5EbIKxQXAgeIcwXBXALl89Ah8

    @GET("nearbysearch/json")
    fun getData(
        @Query("location") location: String,
        @Query("radius") radius: Int,
        @Query("type") type: String,
        @Query("key")key:String
        ): Call<RestaurantsModel>
}