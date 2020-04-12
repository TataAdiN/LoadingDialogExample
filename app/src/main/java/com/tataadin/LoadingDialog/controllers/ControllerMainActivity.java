package com.tataadin.LoadingDialog.controllers;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import com.tataadin.LoadingDialog.databinding.ActivityMainBinding;
import com.tataadin.LoadingDialog.views.ViewLoadingDialog;

public class ControllerMainActivity implements View.OnClickListener {
    private final ActivityMainBinding binding;
    private Context appContext;
    private ViewLoadingDialog loadingDialog;
    private Handler handler = new Handler();

    public ControllerMainActivity(ActivityMainBinding binding, Context context){
        this.binding = binding;
        this.appContext = context;
        binding.btnLoading.setOnClickListener(this);
        loadingDialog = new ViewLoadingDialog(context);
    }

    @Override
    public void onClick(View view) {
        if (binding.btnLoading == view){

            //Taruh sebelum sebuah proses dimulai
            loadingDialog.setPesan("Mohon Tunggu Sebentar");
            loadingDialog.show();
            //

            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    loadingDialog.dismiss(); //taruh saat proses selesai
                }
            }, 5000);
        }
    }
}
