package com.example.merqueo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_products.*

/**
 * Fragmento mediante el cual se listan los productos
 */
class Products : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonCar.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_products_to_carFragment)
        }
        buttonDetalle.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_products_to_itemDetails)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_products, container, false)
    }
}