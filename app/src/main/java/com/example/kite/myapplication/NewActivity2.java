package com.example.kite.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class NewActivity2 extends AppCompatActivity{
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.content_new2);
        }

        public void onBackButtonClicked(View v) {
            Toast.makeText(getApplicationContext(), "뒤로가기.", Toast.LENGTH_LONG).show();
            finish();

        }

}
