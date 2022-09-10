package com.theandroidcafe.shoppinglist.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.theandroidcafe.shoppinglist.R
import com.theandroidcafe.shoppinglist.databinding.FragmentShoppingItemsListBinding

class ShoppingItemsList : Fragment() {

    private var _binding: FragmentShoppingItemsListBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentShoppingItemsListBinding.inflate(layoutInflater, container, false)

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}