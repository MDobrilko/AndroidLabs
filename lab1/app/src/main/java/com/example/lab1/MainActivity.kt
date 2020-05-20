package com.example.lab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    protected fun showToast(text: String) {
        val toast = Toast.makeText(applicationContext, text, Toast.LENGTH_SHORT)
        toast.show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        showToast("activity \"on create\"")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        showToast("activity \'on start\"")
        super.onStart()
    }

    override fun onResume() {
        showToast("activity \"on resume\"")
        super.onResume()
    }

    override fun onPause() {
        showToast("activity \"on pause\"")
        super.onPause()
    }

    override fun onStop() {
        showToast("activity \"on stop\"")
        super.onStop()
    }

    override fun onDestroy() {
        showToast("activity \"on destroy\"")
        super.onDestroy()
    }
}
