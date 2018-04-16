package com.example.alexeiandrusceac.bookinghotelsonmap.Fragments

import android.annotation.SuppressLint
import android.content.pm.PackageManager
import android.graphics.Camera
import android.location.Location
import android.os.Build
import android.os.Bundle
import android.os.PersistableBundle
import android.support.annotation.RequiresApi
import android.support.v4.app.ActivityCompat
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.alexeiandrusceac.bookinghotelsonmap.R
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.google.android.gms.maps.*
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions

@SuppressLint("Registered")
class FragmentMap : Fragment(), OnMapReadyCallback ,GoogleMap.OnMarkerClickListener {

    companion object {
        private const val LOCATION_PERMISSION_REQUEST_CODE = 1
    }
    override fun onMarkerClick(p0: Marker?): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override  fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.google_map_main,container,false)
    }

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
       // val toolbar: Toolbar = findViewById(R.id.toolbar)
       val fragment : Fragment? = childFragmentManager.findFragmentById(R.id.map)

    }
    override fun onMapReady(googleMap: GoogleMap) {
    val marker = LatLng(-33.867, 151.206)
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(marker))
        googleMap.addMarker(MarkerOptions().title("Hi").position(marker))
    }
}