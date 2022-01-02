package com.quanticheart.project

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.quanticheart.project.databinding.MainActivityBinding

/**
 * A group of *members*.
 *
 * This class has no useful logic; it's just a documentation example.
 *
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = MainActivityBinding.inflate(layoutInflater)

        binding.txt.text = getString(R.string.label_load)
        binding.include.btn.setOnClickListener { }
        binding.include.btn2.setOnClickListener { }

        setContentView(binding.root)
    }
}