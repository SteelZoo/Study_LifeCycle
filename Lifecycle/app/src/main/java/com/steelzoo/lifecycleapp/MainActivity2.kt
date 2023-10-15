package com.steelzoo.lifecycleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.steelzoo.lifecycleapp.databinding.ActivityMain2Binding
import com.steelzoo.lifecycleapp.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    val MY_NAME = "Activity2"

    lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.d(TAG, "onCreate: ${MY_NAME}")
        setText("OnCreate")
        setListener()
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: ${MY_NAME}")
        setText("onStart")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart: ${MY_NAME}")
        setText("onRestart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: ${MY_NAME}")
        setText("onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: ${MY_NAME}")
        setText("onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: ${MY_NAME}")
        setText("onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: ${MY_NAME}")
        setText("onDestroy")
    }

    fun setText(text: String){
        binding.tvLifecycle2.text = text
    }

    fun setListener(){
        binding.btnBack.setOnClickListener {
            finish()
        }

        binding.btnFragment1.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.layout_fragment,Fragment1())
                .commit()
        }

        binding.btnFragment2.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.layout_fragment,Fragment2())
                .commit()
        }
    }
}