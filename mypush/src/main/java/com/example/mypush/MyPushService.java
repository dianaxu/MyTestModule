package com.example.mypush;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.sharelibrary.IMyPushService;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

class MyPushService implements IMyPushService {
    @Override
    public void startMyPushMainActivity(Context context, Bundle bundle) {
        Intent intent = new Intent(context, MainActivity.class);
        context.startActivity(intent);
    }

    @Override
    public Fragment newPushFragment(FragmentManager fragmentManager, int viewId, Bundle bundle) {
        MainFragment fragment = new MainFragment();
        fragment.setArguments(bundle);
        fragmentManager.beginTransaction().replace(viewId, fragment).commit();
        return fragment;
    }
}
