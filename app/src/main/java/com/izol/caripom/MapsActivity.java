package com.izol.caripom;

import android.Manifest;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng siliwangi = new LatLng(-7.348764, 108.220249);
        mMap.addMarker(new MarkerOptions().position(siliwangi).title("SPBU jalan Siliwangi").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).snippet("Pertalite"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(siliwangi));

        LatLng tobing = new LatLng(-7.349770, 108.215744);
        mMap.addMarker(new MarkerOptions().position(tobing).title("SPBU jalan Mayor SL Tobing").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).snippet("Pertalite"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(tobing));

        LatLng sutsen = new LatLng(-7.331427, 108.234029);
        mMap.addMarker(new MarkerOptions().position(sutsen).title("SPBU jalan Sutisna Senjaya").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).snippet("Pertalite"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sutsen));

        LatLng perintis = new LatLng(-7.356849, 108.217282);
        mMap.addMarker(new MarkerOptions().position(perintis).title("SPBU jalan Perintis Kemerdekaan").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).snippet("Pertalite"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(perintis));

        LatLng lestari = new LatLng(-7.348413, 108.226922);
        mMap.addMarker(new MarkerOptions().position(lestari).title("POM Mini Toko Lestari").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)).snippet("Pertalite"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(lestari));

        LatLng terusanBCA = new LatLng(-7.339102, 108.213888);
        mMap.addMarker(new MarkerOptions().position(terusanBCA).title("POM Mini Terusan BCA").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)).snippet("Pertalite"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(terusanBCA));

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            return;
        }
        mMap.setMyLocationEnabled(true);
    }
}
