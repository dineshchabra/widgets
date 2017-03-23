package com.example.dinesh.widgets;

import android.os.Bundle;
import android.app.Activity;
import android.view.KeyEvent;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Toast;




public class MainActivity extends Activity {

    private EditText password;
    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
        addPassListener();

    }

    public void addPassListener() {

        password = (EditText) findViewById(R.id.txtPassword);
        password.setOnKeyListener(new View.OnKeyListener() {

                public boolean onKey(View v, int keyCode, KeyEvent event){

                    if (keyCode == KeyEvent.KEYCODE_ENTER) {

                        // display a floating message
                        Toast.makeText(MainActivity.this,
                                password.getText(), Toast.LENGTH_SHORT).show();
                        return true; }



                    return false;
                }

        });

    }

    public void addListenerOnButton() {

        password = (EditText) findViewById(R.id.txtPassword);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, password.getText(),
                        Toast.LENGTH_SHORT).show();

            }

        });

    }


}
