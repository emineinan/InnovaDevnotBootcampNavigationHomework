package com.example.navigationcomponenthomework

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationcomponenthomework.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        binding.buttonGoABY.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_homeFragment_to_AFragment)
        }

        binding.buttonGoXY.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_homeFragment_to_XFragment)
        }

        return binding.root
    }
}
