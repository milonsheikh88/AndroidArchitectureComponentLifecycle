package com.milonsheikh.architecturecomponentlifecycle;

import androidx.annotation.NonNull;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;

public class MainActivityObserver implements DefaultLifecycleObserver {

    @Override
    public void onCreate(@NonNull LifecycleOwner owner) {
        System.out.println("MainActivityObserver === onCreate ===");
    }

    @Override
    public void onResume(@NonNull LifecycleOwner owner) {
        System.out.println("MainActivityObserver === onResume ===");
    }

    @Override
    public void onStart(@NonNull LifecycleOwner owner) {
        System.out.println("MainActivityObserver === onStart ===");
    }

    @Override
    public void onPause(@NonNull LifecycleOwner owner) {
        System.out.println("MainActivityObserver === onPause ===");
    }

    @Override
    public void onStop(@NonNull LifecycleOwner owner) {
        System.out.println("MainActivityObserver === onStop ===");
    }

    @Override
    public void onDestroy(@NonNull LifecycleOwner owner) {
        System.out.println("MainActivityObserver === onDestroy ===");
    }

}
