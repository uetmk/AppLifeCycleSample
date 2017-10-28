package com.example.applifecyclesample;

import android.content.res.Configuration;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.applifecyclesample.util.Logger;
import com.example.applifecyclesample.view.InitialFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Logger.d("[Activity] onCreate called");
        setContentView(R.layout.layout_base);
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .add(R.id.layout_fragment, new InitialFragment())
                .commit();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Logger.d("[Activity] onStart called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Logger.d("[Activity] onStop called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Logger.d("[Activity] onResume called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Logger.d("[Activity] onPause called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Logger.d("[Activity] onDestroy called");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Logger.d("[Activity] onSaveInstanceState called");
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Logger.d("[Activity] onConfigurationChanged called");
    }
}
