package com.chimsy.sweetalert.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.chimsy.sweetalert.R;
import com.chimsy.sweetalert.helper.MySweetAlerts;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private MySweetAlerts alerts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alerts = new MySweetAlerts(this);

        initialiseWidgets();

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_sweet_alert_basic_massage:
                alerts.basicSwtAlrt("Content Goes Here");
                break;

            case R.id.btn_sweet_alert_txt_under:
                alerts.titleContentSwtAlrt(
                        "Title",
                        "Content Goes Here");
                break;

            case R.id.btn_sweet_alert_error_msg:
                alerts.errorSwtAlrt(
                        "Title",
                        "Content Goes Here");
                break;

            case R.id.btn_sweet_alert_warning:
                alerts.warningSwtAlrt(
                        "Title",
                        "Content",
                        "Confirm");
                break;

            case R.id.btn_sweet_alert_success:
                alerts.successSwtAlrt(
                        "Title",
                        "Content Goes Here");
                break;

            case R.id.btn_sweet_alert_custom_icon:
                alerts.customIconSwtAlrt(
                        "Title",
                        "Content",
                        R.drawable.custom_img);
                break;

            case R.id.btn_sweet_alert_confirm_btn:
                alerts.confirmDiagSwtAlrt(
                        "Title",
                        "Content",
                        "Btn Text");
                break;

            case R.id.btn_sweet_alert_cancel_btn:
                alerts.confirmCancelDiagSwtAlrt(
                        "Title",
                        "Content",
                        "Cancel",
                        "Confirm");
                break;

            case R.id.btn_sweet_alert_change_dialg_style:
                alerts.switchDialogSwtAlrt(
                        "Initial Title",
                        "Initial Content",
                        "Initial Btn",
                        "Secondary Title",
                        "Secondary Content",
                        "Secondary Button");
                break;

        }

    }

    private void initialiseWidgets() {
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

}
