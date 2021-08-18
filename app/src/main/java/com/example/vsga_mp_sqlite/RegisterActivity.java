package com.example.vsga_mp_sqlite;

import static com.example.vsga_mp_sqlite.LoginActivity.fromHtml;

import android.content.ContentValues;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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

        TextView tv_tolog = (TextView) findViewById(R.id.tv_tologin);

        tv_tolog.setText(fromHtml("Back to" + "</font><font color=3b5998>Login</font>"));

        tv_tolog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
            }
        });

        bt_reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = et_user.getText().toString().trim();
                String password = et_pass.getText().toString().trim();
                String conpass = et_conpass.getText().toString().trim();

                ContentValues values = new ContentValues();

                if (!password.equals(conpass)) {
                    Toast.makeText(RegisterActivity.this, "Password not match", Toast.LENGTH_SHORT).show();
                } else if (password.equals("") || username.equals("")) {
                    Toast.makeText(RegisterActivity.this, "Username or Password cannot be empty", Toast.LENGTH_SHORT).show();
                } else {
                    values.put(DBHelper.row_username, username);
                    values.put(DBHelper.row_password, password);
                    dbHelper.insertData(values);

                    Toast.makeText(RegisterActivity.this, "Register sucessful",Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });
    }

    public static Spanned fromHtml (String html) {
        Spanned result;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            result = Html.fromHtml(html, Html.FROM_HTML_MODE_LEGACY);
        } else {
            result = Html.fromHtml(html);
        }
        return result;
    }
}