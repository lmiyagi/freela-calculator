package br.com.leonardomiyagi.freelancecalculator

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import br.com.leonardomiyagi.freelancecalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.calculateButton.setOnClickListener { calculate() }
        // (SMI / 172) * (TEH * 1.3)
    }

    private fun calculate() {
        val salary: Double = binding.idealSalaryEditText.text.toString().toDouble()
        val time: Double = binding.timeEditText.text.toString().toDouble()
        val multiplier: Double = binding.multiplierEditText.text.toString().toDouble()

        val result: Double = ((salary / 172) * (time * 1.3)) * multiplier

        binding.resultTextView.text = getString(R.string.main_result, result)
    }
}
