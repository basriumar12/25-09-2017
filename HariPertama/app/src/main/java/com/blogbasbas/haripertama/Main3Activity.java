package com.blogbasbas.haripertama;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Toast.makeText(Main3Activity.this, "Ini Method On Create",
                Toast.LENGTH_SHORT).show();
        //Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "ini Method OnStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        Toast.makeText(this, "ini Method OnResume", Toast.LENGTH_SHORT).show();
        super.onResume();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "ini Method OnResstart", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "ini Method OnPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "ini Method OnStop", Toast.LENGTH_SHORT).show();
    }
}
