package com.fenjuly.arrowdownloadbutton;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {


    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               showEditDialog();
            }
        });
    }
    private void showEditDialog() {
        FragmentManager fm = getSupportFragmentManager();
        DialogSucesso dialogSucesso = new DialogSucesso();
        dialogSucesso.showDialog(this);
    }


}
