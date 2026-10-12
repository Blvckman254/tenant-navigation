package com.example.mytenantmanagementsystem

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mytenantmanagementsystem.databinding.FragmentAddTenantsBinding
class AddTenantFragment : Fragment() {
    private var _binding: FragmentAddTenantsBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAddTenantsBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // The SAVE button is added in Practical 3
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
