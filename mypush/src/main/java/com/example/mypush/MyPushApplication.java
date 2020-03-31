package com.example.mypush;

import android.app.Application;

import com.example.sharelibrary.IComponentApplication;
import com.example.sharelibrary.ServiceFactory;

public class MyPushApplication extends Application implements IComponentApplication {
    private static Application application;

    public static Application getApplication() {
        return application;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public void initialize(Application app) {
        application = app;
        ServiceFactory.getInstance().setMyPushService(new MyPushService());
    }

}
