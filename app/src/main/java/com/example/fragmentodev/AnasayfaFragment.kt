package com.example.fragmentodev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.fragmentodev.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {
    private lateinit var tasarim:FragmentAnasayfaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {

        tasarim = FragmentAnasayfaBinding .inflate( inflater, container, false)
        tasarim.buttonGitA.setOnClickListener {

            Navigation.findNavController(it).navigate(R.id.asayfasinagecis)

        }

        tasarim.buttonGitX.setOnClickListener {

            Navigation.findNavController(it).navigate(R.id.xsayfasinagecis)
        }

        return tasarim.root
    }



}