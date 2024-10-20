package com.example.kotlin_databinding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.kotlin_databinding.databinding.FragmentMainBinding


class MainFragment : Fragment() {

    lateinit var binding: FragmentMainBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_main, container, false)
        val view = binding.root

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btSubmit.setOnClickListener {
           var text2 =  binding.etInput.text.toString().trim()

            if(text2.isNotEmpty()){
               binding.tvOutput.text = text2
            }
            else{

                Toast.makeText(requireContext(), "please enter input", Toast.LENGTH_SHORT).show()
            }
        }
    }
}