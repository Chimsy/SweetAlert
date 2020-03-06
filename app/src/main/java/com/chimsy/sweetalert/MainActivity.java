package com.chimsy.sweetalert;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.ontbee.legacyforks.cn.pedant.SweetAlert.SweetAlertDialog;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_sweet_alert_basic_massage = findViewById(R.id.btn_sweet_alert_basic_massage);
        Button btn_sweet_alert_txt_under = findViewById(R.id.btn_sweet_alert_txt_under);
        Button btn_sweet_alert_error_msg = findViewById(R.id.btn_sweet_alert_error_msg);
        Button btn_sweet_alert_warning = findViewById(R.id.btn_sweet_alert_warning);
        Button btn_sweet_alert_success = findViewById(R.id.btn_sweet_alert_success);
        Button btn_sweet_alert_custom_icon = findViewById(R.id.btn_sweet_alert_custom_icon);
        Button btn_sweet_alert_confirm_btn = findViewById(R.id.btn_sweet_alert_confirm_btn);
        Button btn_sweet_alert_cancel_btn = findViewById(R.id.btn_sweet_alert_cancel_btn);
        Button btn_sweet_alert_change_dialg_style = findViewById(R.id.btn_sweet_alert_change_dialg_style);

        btn_sweet_alert_basic_massage.setOnClickListener(this);
        btn_sweet_alert_txt_under.setOnClickListener(this);
        btn_sweet_alert_error_msg.setOnClickListener(this);
        btn_sweet_alert_warning.setOnClickListener(this);
        btn_sweet_alert_success.setOnClickListener(this);
        btn_sweet_alert_custom_icon.setOnClickListener(this);
        btn_sweet_alert_confirm_btn.setOnClickListener(this);
        btn_sweet_alert_cancel_btn.setOnClickListener(this);
        btn_sweet_alert_change_dialg_style.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_sweet_alert_basic_massage:
                //A basic message：
                new SweetAlertDialog(this)
                        .setTitleText("Here's a message!")
                        .show();
                break;

            case R.id.btn_sweet_alert_txt_under:
                // A title with a text under：
                new SweetAlertDialog(this)
                        .setTitleText("Here's a message!")
                        .setContentText("It's pretty, isn't it?")
                        .show();
                break;

            case R.id.btn_sweet_alert_error_msg:
                // A error message：
                new SweetAlertDialog(this, SweetAlertDialog.ERROR_TYPE)
                        .setTitleText("Oops...")
                        .setContentText("Something went wrong!")
                        .show();
                break;

            case R.id.btn_sweet_alert_warning:
                //A warning message：
                new SweetAlertDialog(this, SweetAlertDialog.WARNING_TYPE)
                        .setTitleText("Are you sure?")
                        .setContentText("Won't be able to recover this file!")
                        .setConfirmText("Yes,delete it!")
                        .show();
                break;

            case R.id.btn_sweet_alert_success:
                // A success message：
                new SweetAlertDialog(this, SweetAlertDialog.SUCCESS_TYPE)
                        .setTitleText("Good job!")
                        .setContentText("You clicked the button!")
                        .show();
                break;

            case R.id.btn_sweet_alert_custom_icon:
                // A message with a custom icon：
                new SweetAlertDialog(this, SweetAlertDialog.CUSTOM_IMAGE_TYPE)
                        .setTitleText("Sweet!")
                        .setContentText("Here's a custom image.")
                        .setCustomImage(R.drawable.custom_img)
                        .show();
                break;

            case R.id.btn_sweet_alert_confirm_btn:
                // Bind the listener to confirm button：
                new SweetAlertDialog(this, SweetAlertDialog.WARNING_TYPE)
                        .setTitleText("Are you sure?")
                        .setContentText("Won't be able to recover this file!")
                        .setConfirmText("Yes,delete it!")
                        .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                            @Override
                            public void onClick(SweetAlertDialog sDialog) {
                                sDialog.dismissWithAnimation();
                            }
                        })
                        .show();
                break;

            case R.id.btn_sweet_alert_cancel_btn:
                //Show the cancel button and bind listener to it：
        new SweetAlertDialog(this, SweetAlertDialog.WARNING_TYPE)
                .setTitleText("Are you sure?")
                .setContentText("Won't be able to recover this file!")
                .setCancelText("No,cancel plx!")
                .setConfirmText("Yes,delete it!")
                .showCancelButton(true)
                .setCancelClickListener(new SweetAlertDialog.OnSweetClickListener() {
                    @Override
                    public void onClick(SweetAlertDialog sDialog) {
                        sDialog.cancel();
                    }
                })
                .show();
                break;

            case R.id.btn_sweet_alert_change_dialg_style:
                //Change the dialog style upon confirming：
                new SweetAlertDialog(this, SweetAlertDialog.WARNING_TYPE)
                        .setTitleText("Are you sure?")
                        .setContentText("Won't be able to recover this file!")
                        .setConfirmText("Yes,delete it!")
                        .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                            @Override
                            public void onClick(SweetAlertDialog sDialog) {
                                sDialog
                                        .setTitleText("Deleted!")
                                        .setContentText("Your imaginary file has been deleted!")
                                        .setConfirmText("OK")
                                        .setConfirmClickListener(null)
                                        .changeAlertType(SweetAlertDialog.SUCCESS_TYPE);
                            }
                        })
                        .show();
                break;

        }

    }
}
