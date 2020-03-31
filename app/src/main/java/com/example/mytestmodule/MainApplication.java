package com.example.mytestmodule;

import android.app.Application;
import android.util.Log;

import com.example.sharelibrary.AppConfig;
import com.example.sharelibrary.IComponentApplication;

public class MainApplication extends Application implements IComponentApplication {
    private static Application application;

    public static Application getApplication() {
        return application;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        initialize(this);
    }

    @Override
    public void initialize(Application application) {
        for (String cpnt : AppConfig.Components) {
            try {
                Class<?> clz = Class.forName(cpnt);
                Object obj = clz.newInstance();
                if (obj instanceof IComponentApplication) {
                    ((IComponentApplication) obj).initialize(this);
                }
            } catch (Exception e) {
                Log.e("TAG", e.getMessage());
            }
        }
    }

}
