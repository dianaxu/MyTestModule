package com.example.sharelibrary;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public interface IMyPushService {

    void startMyPushMainActivity(Context context, Bundle bundle);

    Fragment newPushFragment(FragmentManager fragmentManager, int viewId, Bundle bundle);
}
