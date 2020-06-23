package com.panorama.offlinenotificationdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.panorama.offlinenotificationdemo.databinding.ActivityNotificationDetailsBinding;

public class NotificationDetailsActivity extends AppCompatActivity {
    ActivityNotificationDetailsBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       binding = DataBindingUtil.setContentView(this,R.layout.activity_notification_details);
       String content = getIntent().getStringExtra("content");
       binding.tvNotifiData.setText(content);


    }
}