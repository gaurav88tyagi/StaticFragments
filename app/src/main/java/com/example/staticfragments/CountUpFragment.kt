package com.example.staticfragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_count_up.view.*

class CountUpFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var count = 0
        val fragmentView = inflater.inflate(R.layout.fragment_count_up, container, false)

        fragmentView.btnAdd.setOnClickListener {
            count++
            fragmentView.tvCountUp.text = count.toString()
        }

        return fragmentView

    }
}
