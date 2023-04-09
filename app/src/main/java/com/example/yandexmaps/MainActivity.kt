package com.example.yandexmaps

import android.content.Context
import android.content.Intent
import android.graphics.BitmapFactory
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Icon
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.graphics.drawable.toBitmap
import com.google.android.material.snackbar.Snackbar
import com.yandex.mapkit.Animation
import com.yandex.mapkit.MapKitFactory
import com.yandex.mapkit.geometry.Point
import com.yandex.mapkit.map.CameraPosition
import com.yandex.mapkit.map.MapObject
import com.yandex.mapkit.map.MapObjectTapListener
import com.yandex.mapkit.mapview.MapView
import com.yandex.runtime.image.ImageProvider
import com.yandex.runtime.ui_view.ViewProvider
import java.math.RoundingMode
import java.text.DecimalFormat


class MainActivity : AppCompatActivity() {

    lateinit var mapView: MapView
    private val MIREA_LOCATION = Point(55.670093, 37.480134)
    private val LOCATIONS = mapOf(
        "MOSCOW_LOCATION" to Point(55.7522, 37.6156),
        "SYDNEY_LOCATION" to Point(-33.865255, 151.216484),
        "PARIS_LOCATION" to Point(48.856663, 2.351556),
        "MONTREAL_LOCATION" to Point(45.498307, -73.568500))

    private val moscowTapListener: MapObjectTapListener = MapObjectTapListener { _, _ ->
        val intent = Intent(this, QuizActivity::class.java)
        intent.putExtra("city", "Moscow")
        startActivity(intent)
        return@MapObjectTapListener true
    }
    private val sydneyTapListener: MapObjectTapListener = MapObjectTapListener { _, _ ->
        val intent = Intent(this, QuizActivity::class.java)
        intent.putExtra("city", "Sydney")
        startActivity(intent)
        return@MapObjectTapListener true
    }
    private val parisTapListener: MapObjectTapListener = MapObjectTapListener { _, _ ->
        val intent = Intent(this, QuizActivity::class.java)
        intent.putExtra("city", "Paris")
        startActivity(intent)
        return@MapObjectTapListener true
    }
    private val montrealTapListener: MapObjectTapListener = MapObjectTapListener { _, _ ->
        val intent = Intent(this, QuizActivity::class.java)
        intent.putExtra("city", "Montreal")
        startActivity(intent)
        return@MapObjectTapListener true
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MapKitFactory.setApiKey("5c9eada9-3c5c-48e2-a3b4-61e48079b3bb")
        MapKitFactory.initialize(this)
        setContentView(R.layout.activity_main)

        mapView = findViewById(R.id.mapview)
        mapView.map.move(CameraPosition(MIREA_LOCATION , 15.0f, 0.0f, 0.0f),
                Animation(Animation.Type.SMOOTH, 5f), null)

        var mapObjectCollection = mapView.map.addMapObjectLayer("layer")

        val markMoscow = mapObjectCollection.addPlacemark(LOCATIONS["MOSCOW_LOCATION"]!!)
        markMoscow.setIcon(ImageProvider.fromBitmap(getDrawable(R.drawable.ic_baseline_location_on_24)!!.toBitmap()))
        markMoscow.addTapListener(moscowTapListener)
        val markSydney = mapObjectCollection.addPlacemark(LOCATIONS["SYDNEY_LOCATION"]!!)
        markSydney.setIcon(ImageProvider.fromBitmap(getDrawable(R.drawable.ic_baseline_location_on_24)!!.toBitmap()))
        markSydney.addTapListener(sydneyTapListener)
        val markParis = mapObjectCollection.addPlacemark(LOCATIONS["PARIS_LOCATION"]!!)
        markParis.setIcon(ImageProvider.fromBitmap(getDrawable(R.drawable.ic_baseline_location_on_24)!!.toBitmap()))
        markParis.addTapListener(parisTapListener)
        val markMontreal = mapObjectCollection.addPlacemark(LOCATIONS["MONTREAL_LOCATION"]!!)
        markMontreal.setIcon(ImageProvider.fromBitmap(getDrawable(R.drawable.ic_baseline_location_on_24)!!.toBitmap()))
        markMontreal.addTapListener(montrealTapListener)

    }

    override fun onStop() {
        mapView.onStop()
        MapKitFactory.getInstance().onStop()
        super.onStop()
    }

    override fun onStart() {
        super.onStart()
        MapKitFactory.getInstance().onStart()
        mapView.onStart()
    }
}