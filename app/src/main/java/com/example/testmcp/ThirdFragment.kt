package com.example.testmcp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.testmcp.databinding.FragmentThirdBinding

/**
 * A Fragment that displays user profile information based on the ProfileScreen design from Figma.
 */
class ThirdFragment : Fragment() {

    private var _binding: FragmentThirdBinding? = null
    
    // This property is only valid between onCreateView and onDestroyView
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment using View Binding
        _binding = FragmentThirdBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Set up click handlers for each menu item
        binding.layoutEditProfile.setOnClickListener {
            Toast.makeText(context, "Edit Profile clicked", Toast.LENGTH_SHORT).show()
            // Navigate to edit profile screen when implemented
        }

        binding.layoutComplaints.setOnClickListener {
            Toast.makeText(context, "Pengaduan clicked", Toast.LENGTH_SHORT).show()
            // Navigate to complaints screen when implemented
        }

        binding.layoutHelp.setOnClickListener {
            Toast.makeText(context, "Bantuan clicked", Toast.LENGTH_SHORT).show()
            // Navigate to help screen when implemented
        }

        binding.layoutLogout.setOnClickListener {
            Toast.makeText(context, "Log out clicked", Toast.LENGTH_SHORT).show()
            // Implement logout functionality
            // For demo purposes, navigate back to the first fragment
            findNavController().navigate(R.id.action_ThirdFragment_to_FirstFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}