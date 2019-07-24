package com.suleymanovtat.navigationapplication

import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity(), DetailsFragment.OnFragmentInteractionListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)
//        if (savedInstanceState == null) {
//            supportFragmentManager.beginTransaction()
//                .replace(R.id.container, SecondFragment.newInstance())
//                .commitNow()
//        }
    }

    override fun onFragmentInteraction(uri: Uri) {

    }
}
