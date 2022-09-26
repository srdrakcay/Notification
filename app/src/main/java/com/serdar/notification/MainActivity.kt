package com.serdar.notification

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Organization.TITLE
import com.serdar.notification.Constants.Companion.DESCRIPTION
import com.serdar.notification.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)



        binding.button.setOnClickListener {
            Notification.exampleNotification(this,TITLE,
                DESCRIPTION)
        }
    }
}