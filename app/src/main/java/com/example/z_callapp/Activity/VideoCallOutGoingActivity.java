package com.example.z_callapp.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.NotificationManager;
import android.os.Bundle;
import android.os.Handler;

import com.bumptech.glide.Glide;
import com.example.z_callapp.Model.VcModel;
import com.example.z_callapp.R;
import com.example.z_callapp.databinding.ActivityVideoCallOutGoingBinding;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.messaging.FcmBroadcastProcessor;


public class VideoCallOutGoingActivity extends AppCompatActivity {
    ActivityVideoCallOutGoingBinding binding;
    String senderUid;
    String receiverUid;
    FirebaseAuth auth;

    String receiverName, phoneNumber, receiverPhoneNumber;
    DatabaseReference reference, cancelRef;
    FirebaseDatabase database;
    VcModel model;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityVideoCallOutGoingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        receiverUid = getIntent().getStringExtra("uid");
        senderUid = FirebaseAuth.getInstance().getUid();
        database = FirebaseDatabase.getInstance();
        reference = database.getReference("users").child(receiverUid);
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (snapshot.exists()) {
                    receiverName = snapshot.child("name").getValue().toString();
                    String currentImage = String.valueOf(snapshot.child("profileImage").getValue());
                    binding.nameVcOg.setText(receiverName);
                    Glide.with(VideoCallOutGoingActivity.this)
                            .load(currentImage)
                            .into(binding.imageOutCalling);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }
    }



