package com.example.sharelibrary;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class EmptyMyPushService implements IMyPushService {
    @Override
    public void startMyPushMainActivity(Context context, Bundle bundle) {

    }

    @Override
    public Fragment newPushFragment(FragmentManager fragmentManager, int viewId, Bundle bundle) {
        return null;
    }
}
