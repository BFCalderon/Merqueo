package com.example.merqueo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_car.*

/**
 * Fragmento que contiene la información con los productos agregados
 */
class CarFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_car, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonDetail.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_carFragment_to_itemDetails)
        }
        buttonProducts.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_carFragment_to_products)
        }
    }

}