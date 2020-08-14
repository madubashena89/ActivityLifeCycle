package top.stores.activitylifecycle.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import top.stores.activitylifecycle.services.MediaService;
import top.stores.activitylifecycle.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static String tag = "TAG";
    private TextView textView;
    protected Button startServiceButton, stopServiceButton, seconActivityButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.tv_method_name);
        Log.d(tag, "onCreate called");
        Toast.makeText(this, "onCreate called", Toast.LENGTH_SHORT).show();

        startServiceButton = findViewById(R.id.btn_start_service);
        stopServiceButton = findViewById(R.id.btn_end_service);
        seconActivityButton = findViewById(R.id.btn_to_second_activity);


        startServiceButton.setOnClickListener(this);
        stopServiceButton.setOnClickListener(this);
        seconActivityButton.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        if(view == startServiceButton){
            startService(new Intent(this, MediaService.class));
        }else if(view == seconActivityButton){
            startActivity(new Intent(this, SecondActivity.class));
        }
        else {
            stopService(new Intent(this, MediaService.class));
        }


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(tag, "onStart called");
        Toast.makeText(this, "onStart called", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(tag, "onResume called");
        Toast.makeText(this, "onResume called", Toast.LENGTH_SHORT).show();


    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(tag, "onPause called");
        Toast.makeText(this, "onPause called", Toast.LENGTH_SHORT).show();


    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(tag, "onStop called");
        Toast.makeText(this, "onStop called", Toast.LENGTH_SHORT).show();


    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(tag, "onDestroy called");
        Toast.makeText(this, "onDestroy called", Toast.LENGTH_SHORT).show();


    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(tag, "onRestart called");
        Toast.makeText(this, "onRestart called", Toast.LENGTH_SHORT).show();

    }


}