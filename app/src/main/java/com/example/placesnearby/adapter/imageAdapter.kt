package com.example.placesnearby.adapter

import android.util.Log
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.example.placesnearby.model.RestaurantsModel


@BindingAdapter("ImageUrl")
fun ImageView.imageUrl(model: RestaurantsModel.Result) {

    Glide.with(this.context)
        .load("https://maps.googleapis.com/maps/api/place/photo?photoreference=Aap_uEBYt7MaMXcJZYVt_3Frd2kilCIUZYeJzNwj-rMVVd1eedWCSE36_E7TUdpFhQl9cUrlNjlmyVR4tNizqphYLqhekqUuVIo1sy4nCTbyl7Hf0_zTIhIULsoVKDyjckbFiLpn7Gkp34uM1xsDGxEYg7ZBUzZS3ccKEtprjWBE7v3QR5RU&sensor=false&maxheight=4608&maxwidth=3456&key=AIzaSyAymWBDEP5EbIKxQXAgeIcwXBXALl89Ah8")
        .into(this)
}