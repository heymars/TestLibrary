package com.skv.testformlib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {
    private EditText name;
    private EditText email;
    private EditText mobile;
    private EditText message;
    private Button validate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        name = findViewById(R.id.et_name);
        email = findViewById(R.id.et_email);
        mobile = findViewById(R.id.et_mobile);
        message = findViewById(R.id.et_message);
        validate = findViewById(R.id.btn_validate);
        validate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkValidation();
            }
        });
    }

    private void checkValidation() {
        // Not a complete validation just for testing
        if (name.getText().toString().trim().isEmpty()){
            showToast();
        }else if (email.getText().toString().trim().isEmpty()){
            showToast();
        }else if (mobile.getText().toString().trim().isEmpty()){
            showToast();
        }else if (message.getText().toString().trim().isEmpty()){
            showToast();
        }
    }

    private void showToast(){
        Toast.makeText(getApplicationContext(),"This field can not be empty",Toast.LENGTH_SHORT).show();
    }
}
