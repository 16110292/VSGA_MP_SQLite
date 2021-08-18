package com.example.vsga_mp_sqlite;

import static android.text.Html.fromHtml;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

        EditText et_user, et_password;
        Button bt_login;
        DBHelper dbHelper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        et_user = (EditText) findViewById(R.id.et_user_login);
        et_password = (EditText) findViewById(R.id.et_pass_login);
        bt_login = (Button) findViewById(R.id.bt_login);

        dbHelper = new DBHelper(this);

        TextView tvCreateAccount = (TextView) findViewById(R.id.tv_create);

        tvCreateAccount.setText(fromHtml( "I don't have account yet. " + "</font><"));
    }
}