package com.csx4109.assignment

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.csx4109.assignment.databinding.ActivityExampleAssignmentBinding

/**
 * Page Name: Counting Game
 *
 * -- Description --
 * Create an app that has
 * - textView named `tvCounter`
 * - button named `btnPlus`
 * - button named `btnMinus`
 *
 * Cases
 * - When open an application, the first value in `tvCounter` should be 0
 * - When click `btnPlus`, `tvCounter` should be increased by 1
 * - When click `btnMinus`, `tvCounter` should be decreased by 1
 */

class ExampleAssignmentActivity : AppCompatActivity() {
    private lateinit var binding: ActivityExampleAssignmentBinding
    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExampleAssignmentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set initial counter value
        updateCounter()

        // Increment counter when btnPlus is clicked
        binding.btnPlus.setOnClickListener {
            counter++
            updateCounter()
        }

        // Decrement counter when btnMinus is clicked
        binding.btnMinus.setOnClickListener {
            counter--
            updateCounter()
        }
    }

    private fun updateCounter() {
        binding.tvCounter.text = counter.toString()
    }
}