package com.steelzoo.lifecycleapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.steelzoo.lifecycleapp.databinding.ActivityMainBinding

const val TAG = "lifecycle_확인"

class MainActivity : AppCompatActivity() {


    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.d(TAG, "onCreate: ")
        setText("OnCreate")
        setListener()
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: ")
        setText("onStart")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart: ")
        setText("onRestart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: ")
        setText("onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: ")
        setText("onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: ")
        setText("onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: ")
        setText("onDestroy")
    }

    fun setText(text: String){
        binding.tvLifecycle.text = text
    }

    fun setListener(){
        binding.btnTo2.setOnClickListener {
            startActivity(Intent(baseContext,MainActivity2::class.java))
        }
    }
}