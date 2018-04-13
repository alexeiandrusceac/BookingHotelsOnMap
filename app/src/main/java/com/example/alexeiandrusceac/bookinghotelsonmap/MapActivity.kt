package com.example.alexeiandrusceac.bookinghotelsonmap

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap

class MapActivity : AppCompatActivity(), OnMapReadyCallback  {
    private lateinit var mapGoogle : GoogleMap

    override fun onMapReady(googleMap: GoogleMap) {

        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        mapGoogle = googleMap

        val sydney = LatLng(-34.0, 151.0)
        mapGoogle.addMarker(MarkerOptions().position(sydney).title("Marker in Sydney"))
        mapGoogle.moveCamera(CameraUpdateFactory.newLatLng(sydney))
    }


    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.google_map_main)
        val mapFragment = supportFragmentManager.findFragmentById(R.id.map2) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }
//////ca exemplu uitate mai jos
    /*override fun OnMapReady(googleMap: GoogleMap){

https://www.raywenderlich.com/183588/introduction-google-maps-api-android-2


    }*/
}