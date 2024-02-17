package com.example.pract1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;
import android.content.Context;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    public void showToast(CharSequence text){
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        Log.i(TAG, "Появилось всплывающее окно");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showToast("Creat toast!");

    }
    @Override
    protected void onStart() {
        super.onStart();
        showToast("Start toast!");
        Log.e(TAG,"Moon, tell me if I could\n" +
                "Send up my heart to you?");
    }
    @Override
    protected void onStop() {
        super.onStop();
        showToast("Stop toast!");
        Log.e(TAG,"Красные башмачки");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        showToast("Destroy toast!");
        Log.e(TAG,"Venus, planet of love\n" +
                "Was destroyed by global warming");
    }
    @Override
    protected void onPause() {
        super.onPause();
        showToast("Pause toast!");
        Log.w(TAG,"Не забудьте закрыть приложение");

    }
    @Override
    protected void onResume() {
        super.onResume();
        showToast("Resume toast!");
        Log.d(TAG,"onResume");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        showToast("Restart toast!");
        Log.v(TAG,"Give me more, give me more, give me more");
    }
}