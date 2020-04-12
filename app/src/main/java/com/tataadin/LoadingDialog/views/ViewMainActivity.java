package com.tataadin.LoadingDialog.views;

import android.view.LayoutInflater;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.tataadin.LoadingDialog.controllers.ControllerMainActivity;
import com.tataadin.LoadingDialog.databinding.ActivityMainBinding;

public class ViewMainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private ControllerMainActivity controllerMainActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this));
        controllerMainActivity = new ControllerMainActivity(binding, this);
        setContentView(binding.getRoot());
    }
}
