package com.suleymanovtat.navigationapplication.ui.second

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.Navigation
import com.suleymanovtat.navigationapplication.R
import kotlinx.android.synthetic.main.second_fragment.*

class SecondFragment : Fragment() {

    companion object {
        fun newInstance() = SecondFragment()
    }

    private lateinit var viewModel: SecondViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        return inflater.inflate(R.layout.second_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(SecondViewModel::class.java)
        tvMessage.setOnClickListener {
            Log.e("my", "tvMessage")
            Navigation.findNavController(it).navigate(SecondFragmentDirections.actionToDetailsFragment())
        }
        button.setOnClickListener {
            Navigation.findNavController(it).navigate(SecondFragmentDirections.actionToOtherFragment("DATE 2019","ILMIR"))
        }
    }
}
