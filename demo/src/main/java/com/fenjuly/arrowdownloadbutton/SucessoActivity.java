package com.fenjuly.arrowdownloadbutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.fenjuly.library.CheckSucesso;

public class SucessoActivity extends AppCompatActivity {

    CheckSucesso button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        button = (CheckSucesso)findViewById(R.id.arrow_download_button);
        button.startAnimating();

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        button.startAnimating();
    }
}
