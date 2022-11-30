package com.example.z_callapp.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.z_callapp.R;
import com.example.z_callapp.databinding.ActivityGroupsChatBinding;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class GroupsChatActivity extends AppCompatActivity {

    private View groupsView;
    private ListView listView;
    private ArrayAdapter<String> arrayAdapter;
    private ArrayList<String> list_of_groups = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_groups_chat);
    }
}