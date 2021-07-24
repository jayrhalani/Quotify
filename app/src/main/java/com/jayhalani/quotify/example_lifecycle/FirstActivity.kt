package com.jayhalani.quotify.example_lifecycle

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.jayhalani.quotify.R

class FirstActivity : AppCompatActivity() {
    companion object {
        val TAG: String = FirstActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        lifecycle.addObserver(FirstObserver())
        Log.e(FirstObserver.TAG, "LIFECYCLE -> ACTIVITY -> ON_CREATE")
    }

    override fun onStart() {
        super.onStart()
        Log.e(FirstObserver.TAG, "LIFECYCLE -> ACTIVITY -> ON_START")
    }

    override fun onResume() {
        super.onResume()
        Log.e(FirstObserver.TAG, "LIFECYCLE -> ACTIVITY -> ON_RESUME")
    }

    override fun onPause() {
        super.onPause()
        Log.e(FirstObserver.TAG, "LIFECYCLE -> ACTIVITY -> ON_PAUSE")
    }

   /* override fun onRestart() {
        super.onRestart()
        Log.e(FirstObserver.TAG, "LIFECYCLE -> ACTIVITY -> ON_CREATE")
    }*/

    override fun onStop() {
        super.onStop()
        Log.e(FirstObserver.TAG, "LIFECYCLE -> ACTIVITY -> ON_STOP")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(FirstObserver.TAG, "LIFECYCLE -> ACTIVITY -> ON_DESTROY")

    }
}