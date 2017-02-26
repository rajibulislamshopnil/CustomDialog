package com.ris.customdialog;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button login, submit,cancel;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = (Button)findViewById(R.id.button_login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(MainActivity.this);
                dialog.setTitle("Login Dialog");
                dialog.setContentView(R.layout.custom_dialog_layout);
                dialog.show();
                editText = (EditText)dialog.findViewById(R.id.editText_pin);
                submit = (Button)dialog.findViewById(R.id.button_submit);
                cancel = (Button)dialog.findViewById(R.id.button_cancel);
                submit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String text  = editText.getText().toString();
                        Toast.makeText(MainActivity.this, "You are logged in", Toast.LENGTH_SHORT).show();
                        dialog.cancel();
                    }
                });
                cancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.cancel();
                    }
                });
            }
        });

    }
}
