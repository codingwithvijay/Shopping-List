package com.theandroidcafe.shoppinglist.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.theandroidcafe.shoppinglist.databinding.FragmentShoppingListBinding
import com.theandroidcafe.shoppinglist.util.logMe

class ShoppingList : Fragment() {


    private var _binding: FragmentShoppingListBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentShoppingListBinding.inflate(layoutInflater, container, false)


        binding.textView.setOnClickListener {
            logMe("clicked text view")
            findNavController().navigate(ShoppingListDirections.actionShoppingListToShoppingItemsList())
        }
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}