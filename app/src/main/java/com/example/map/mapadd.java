package com.example.map;

import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;

import com.example.myapplication.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class mapadd extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker and move the camera to a specific location
        LatLng location = new LatLng(37.7749, -122.4194); // Example: San Francisco
        mMap.addMarker(new MarkerOptions().position(location).title("Marker in San Francisco"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(location, 12)); // You can adjust the zoom level
    }
}