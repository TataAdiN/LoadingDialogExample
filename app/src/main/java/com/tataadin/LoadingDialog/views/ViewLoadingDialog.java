package com.tataadin.LoadingDialog.views;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import com.tataadin.LoadingDialog.databinding.ViewLoadingDialogBinding;

public class ViewLoadingDialog extends Dialog {
    private String pesan = "";
    private ViewLoadingDialogBinding binding;

    public ViewLoadingDialog(Context context) {
        super(context);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ViewLoadingDialogBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        DialogOption();
    }

    private void DialogOption(){
        setCanceledOnTouchOutside(false);
        binding.dialogLoadingPesan.setText(pesan);
    }

    public void setPesan(String pesan) {
        this.pesan = pesan;
    }

}