package com.jayhalani.quotify.example_lifecycle

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

// TODO ASK-> What is LifecycleObserver?
class FirstObserver : LifecycleObserver {

    companion object {
        val TAG: String = FirstObserver::class.java.simpleName
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate() {
        Log.e(TAG, "LIFECYCLE -> OBSERVER -> ON_CREATE")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onStart() {
        Log.e(TAG, "LIFECYCLE -> OBSERVER -> ON_START")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun onResume() {
        Log.e(TAG, "LIFECYCLE -> OBSERVER -> ON_RESUME")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun onPause() {
        Log.e(TAG, "LIFECYCLE -> OBSERVER -> ON_PAUSE")
    }

    /*@OnLifecycleEvent(Lifecycle.Event.)
    fun onRestart() {
        Log.e(TAG, "LIFECYCLE -> OBSERVER -> ON_PAUSE")
    }*/

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onStop() {
        Log.e(TAG, "LIFECYCLE -> OBSERVER -> ON_STOP")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onDestroy() {
        Log.e(TAG, "LIFECYCLE -> OBSERVER -> ON_DESTROY")
    }
}