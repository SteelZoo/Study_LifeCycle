package com.steelzoo.lifecycleapp

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class Fragment2 : Fragment() {

    val MY_NAME = "Fragment2"

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG, "onAttach: ${MY_NAME}")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate: ${MY_NAME}")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_2, container, false)
        Log.d(TAG, "onCreateView: ${MY_NAME}")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(TAG, "onViewCreated: ${MY_NAME}")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.d(TAG, "onViewStateRestored: ${MY_NAME}")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: ${MY_NAME}")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: ${MY_NAME}")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: ${MY_NAME}")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: ${MY_NAME}")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d(TAG, "onSaveInstanceState: ${MY_NAME}")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG, "onDestroyView: ${MY_NAME}")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: ${MY_NAME}")
    }
}