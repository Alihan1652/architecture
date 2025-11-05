package com.example.architecture.presentation.count

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.architecture.databinding.ActivityCountBinding
import com.example.architecture.presentation.CountViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class CountActivity : AppCompatActivity() {
    private val binding by lazy { ActivityCountBinding.inflate(layoutInflater) }
    private val viewModel: CountViewModel by viewModel()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        binding.bthIncrement.setOnClickListener {
            viewModel.increment()
        }
        binding.bthDecrement.setOnClickListener {
            viewModel.decrement()
        }
        binding.bthReset.setOnClickListener {
            viewModel.resetCount()
        }
        viewModel.countData.observe(this) { countData ->
            binding.apply {
                tvCount.text = countData.count.toString()
                tvTime.text = formatMillisToDateTime(countData.createdAt)
                tvTypeOfOperation.text = countData.type0f0peration.value
            }
        }
    }

    fun formatMillisToDateTime(milliseconds: Long, pattern: String = "HH:mm:ss"): String {
        val date = Date(milliseconds)
        val formatter = SimpleDateFormat(pattern, Locale.getDefault())
        return formatter.format(date)
    }
}