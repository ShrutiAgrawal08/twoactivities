package agrawal.shruti.twoactivities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
public static final String TAG ="Main2Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "on start ", Toast.LENGTH_SHORT).show();
        Log.e("Main2Activity:onStart", "called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(Main2Activity.this, "onResume", Toast.LENGTH_SHORT).show();
        Log.e(TAG, "onResume: called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
        Log.e(TAG, "onPause: called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
        Log.e(TAG, "onStop: called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
        Log.e(TAG, "onDestroy: called");
    }
    }

