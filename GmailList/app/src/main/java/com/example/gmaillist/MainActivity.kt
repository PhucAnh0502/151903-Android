package com.example.gmaillist

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.gmaillist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val gmailList = listOf(
            Gmail("A", "Finish deadline", "Finish deadline", "11:59 PM"),
            Gmail("B", "Finish deadline", "Finish deadline", "11:59 PM"),
            Gmail("C", "Finish deadline", "Finish deadline", "11:59 PM")
        )

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = GmailAdapter(gmailList)
    }
}