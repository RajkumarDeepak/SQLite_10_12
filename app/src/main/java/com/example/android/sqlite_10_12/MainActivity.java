package com.example.android.sqlite_10_12;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }
  public void onButtonClick(View v){
    if(v.getId()== R.id.bdisplay){

      Intent i = new Intent(MainActivity.this, display.class);
      startActivity(i);
    }

  }
}

