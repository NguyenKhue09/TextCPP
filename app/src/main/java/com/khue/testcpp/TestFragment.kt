package com.khue.testcpp

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner

class TestFragment : Fragment() {

    override fun onAttach(context: Context) {
        lifecycle.addObserver(MyObserver())
        super.onAttach(context)
        Log.d("TestFragment","onAttach, lifecycle state: ${lifecycle.currentState}")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("TestFragment","onCreate, lifecycle state: ${lifecycle.currentState}")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Log.d("TestFragment","onCreateView, lifecycle state: ${lifecycle.currentState}")
        return inflater.inflate(R.layout.fragment_test, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("TestFragment","onViewCreated, lifecycle state: ${lifecycle.currentState}")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.d("TestFragment","onViewStateRestored, lifecycle state: ${lifecycle.currentState}")
    }

    override fun onStart() {
        super.onStart()
        Log.d("TestFragment","onStart, lifecycle state: ${lifecycle.currentState}")
    }

    override fun onResume() {
        super.onResume()
        Log.d("TestFragment","onResume, lifecycle state: ${lifecycle.currentState}")
    }

    override fun onPause() {
        super.onPause()
        Log.d("TestFragment","onPause, lifecycle state: ${lifecycle.currentState}")
    }

    override fun onStop() {
        super.onStop()
        Log.d("TestFragment","onStop, lifecycle state: ${lifecycle.currentState}")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("TestFragment","onSaveInstanceState, lifecycle state: ${lifecycle.currentState}")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("TestFragment","onDestroyView, lifecycle state: ${lifecycle.currentState}")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("TestFragment","onDestroy, lifecycle state: ${lifecycle.currentState}")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("TestFragment","onDetach, lifecycle state: ${lifecycle.currentState}")
    }

    override fun setUserVisibleHint(isVisibleToUser: Boolean) {
        super.setUserVisibleHint(isVisibleToUser)
    }

    inner class MyObserver : DefaultLifecycleObserver {

        override fun onCreate(owner: LifecycleOwner) {
            super.onCreate(owner)
            Log.i("TestFragment", "MyObserver onCreate, lifecycle state: ${lifecycle.currentState}")
        }

        override fun onStart(owner: LifecycleOwner) {
            super.onStart(owner)
            Log.i("TestFragment", "MyObserver onStart, lifecycle state: ${lifecycle.currentState}")
        }

        override fun onResume(owner: LifecycleOwner) {
            super.onResume(owner)
            Log.i("TestFragment", "MyObserver onResume, lifecycle state: ${lifecycle.currentState}")
        }

        override fun onPause(owner: LifecycleOwner) {
            super.onPause(owner)
            Log.i("TestFragment", "MyObserver onPause, lifecycle state: ${lifecycle.currentState}")
        }

        override fun onStop(owner: LifecycleOwner) {
            super.onStop(owner)
            Log.i("TestFragment", "MyObserver onStop, lifecycle state: ${lifecycle.currentState}")
        }

        override fun onDestroy(owner: LifecycleOwner) {
            super.onDestroy(owner)
            Log.i("TestFragment", "MyObserver onDestroy, lifecycle state: ${lifecycle.currentState}")
        }
    }
}