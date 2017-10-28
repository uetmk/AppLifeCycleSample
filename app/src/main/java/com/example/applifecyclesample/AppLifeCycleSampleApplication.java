package com.example.applifecyclesample;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

import com.example.applifecyclesample.util.Logger;

/**
 * AppLifeCycleSampleApplication class
 */

public class AppLifeCycleSampleApplication extends Application {

    private class MyActivityLifecycleCallbacks implements ActivityLifecycleCallbacks {
        @Override
        public void onActivityCreated(Activity activity, Bundle savedInstanceState){
            Logger.d("[Application] onActivityCreated called");
        }

        @Override
        public void onActivityStarted(Activity activity){
            Logger.d("[Application] onActivityStarted called");
        }

        @Override
        public void onActivityResumed(Activity activity) {
            Logger.d("[Application] onActivityResumed called");
        }

        @Override
        public void onActivityPaused(Activity activity) {
            Logger.d("[Application] onActivityPaused called");
        }

        @Override
        public void onActivityStopped(Activity activity) {
            Logger.d("[Application] onActivityStopped called");
        }

        @Override
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            Logger.d("[Application] onActivitySaveInstanceState called");
        }

        @Override
        public void onActivityDestroyed(Activity activity) {
            Logger.d("[Application] onActivityDestroyed called");
        }
    }

    ActivityLifecycleCallbacks mLifecycleCallback = new MyActivityLifecycleCallbacks();

    public void onCreate() {
        super.onCreate();
        Logger.initialize();
        Logger.d("[Application] onCreate called");
        registerActivityLifecycleCallbacks(mLifecycleCallback);
    }
}
