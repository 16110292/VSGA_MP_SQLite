package com.example.vsga_mp_sqlite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    EditText et_user, et_pass, et_conpass;
    Button bt_reg;
    DBHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        dbHelper = new DBHelper(this);

        et_user = (EditText) findViewById(R.id.et_user_register);
        et_pass = (EditText) findViewById(R.id.et_pass_register);
        et_conpass = (EditText) findViewById(R.id.et_conpass_register);
        bt_reg = (Button) findViewById(R.id.bt_register);

        TextView tv_tolog = (TextView) findViewById(R.id.tv_tologin)


    }
}