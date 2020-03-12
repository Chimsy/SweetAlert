package com.chimsy.sweetalert.helper;

import android.content.Context;
import android.widget.Toast;

import com.chimsy.sweetalert.R;
import com.ontbee.legacyforks.cn.pedant.SweetAlert.SweetAlertDialog;

public class MySweetAlerts {

    private Context context;

    public MySweetAlerts(Context context) {
        this.context = context;
    }

    /* 1. Basic Message */
    public void basicSwtAlrt(String content) {
        new SweetAlertDialog(context)
                .setTitleText(content)
                .show();
    }

    /* 2. Text Under */
    public void titleContentSwtAlrt(String title, String content) {
        new SweetAlertDialog(context)
                .setTitleText(title)
                .setContentText(content)
                .show();
    }

    /* 3. Errors */
    public void errorSwtAlrt(String title, String content) {
        new SweetAlertDialog(context, SweetAlertDialog.ERROR_TYPE)
                .setTitleText(title)
                .setContentText(content)
                .show();
    }

    /* 4. Warning*/
    public void warningSwtAlrt(String title, String content, String confirm) {
        // A warning message：
        new SweetAlertDialog(context, SweetAlertDialog.WARNING_TYPE)
                .setTitleText(title)
                .setContentText(content)
                .setConfirmText(confirm)
                .show();
    }

    /* 5. Success */
    public void successSwtAlrt(String title, String content) {
        // A success message：
        new SweetAlertDialog(context, SweetAlertDialog.SUCCESS_TYPE)
                .setTitleText(title)
                .setContentText(content)
                .show();
    }

    /* 6. Custom Icon */
    public void customIconSwtAlrt(String title, String content, int image) {
        new SweetAlertDialog(context, SweetAlertDialog.CUSTOM_IMAGE_TYPE)
                .setTitleText(title)
                .setContentText(content)
                .setCustomImage(image)
                .show();
    }

    /* 7. Confirm Button */
    public void confirmDiagSwtAlrt(String title, String content, String btn_confirm_text) {
        new SweetAlertDialog(context, SweetAlertDialog.WARNING_TYPE)
                .setTitleText(title)
                .setContentText(content)
                .setConfirmText(btn_confirm_text)
                .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                    @Override
                    public void onClick(SweetAlertDialog sDialog) {
                        Toast.makeText(context, "Confirm Button Clicked: Your Action Goes Here", Toast.LENGTH_SHORT).show();
                        sDialog.dismissWithAnimation();
                    }
                })
                .show();
    }

    /* 8. Confirm & Cancel Buttons */
    public void confirmCancelDiagSwtAlrt(String title, String content, String btn_cancel_text, String btn_confirm_text) {
        new SweetAlertDialog(context, SweetAlertDialog.WARNING_TYPE)
                .setTitleText(title)
                .setContentText(content)
                .setCancelText(btn_cancel_text)
                .setConfirmText(btn_confirm_text)
                .showCancelButton(true)
                .setCancelClickListener(new SweetAlertDialog.OnSweetClickListener() {
                    @Override
                    public void onClick(SweetAlertDialog sDialog) {
                        sDialog.cancel();
                    }
                })
                .show();

    }

    /* 9. Confirm & Caancel Buttons */
    public void switchDialogSwtAlrt(String title_initial, String content_initial, String btn_confirm_text_initial, final String title_secondary, final String content_secondary, final String btn_confirm_text_secondary) {
        new SweetAlertDialog(context, SweetAlertDialog.WARNING_TYPE)
                .setTitleText(title_initial)
                .setContentText(content_initial)
                .setConfirmText(btn_confirm_text_initial)
                .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                    @Override
                    public void onClick(SweetAlertDialog sDialog) {
                        sDialog
                                .setTitleText(title_secondary)
                                .setContentText(content_secondary)
                                .setConfirmText(btn_confirm_text_secondary)
                                .setConfirmClickListener(null)
                                .changeAlertType(SweetAlertDialog.SUCCESS_TYPE);
                    }
                })
                .show();
    }


}
