package com.example.androidnabigation


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.findNavController

/**
 * A simple [Fragment] subclass.
 */
class TitleFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_title, container, false)

        var root:View = inflater.inflate(R.layout.fragment_title, container, false)

        var btnPlay = root.findViewById<TextView>(R.id.btn_play)
        btnPlay.setOnClickListener{view:View ->
            view.findNavController().navigate(R.id.action_titleFragment_to_gameFragment)
        }
        return root
    }


}
