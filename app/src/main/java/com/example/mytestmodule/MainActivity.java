package com.example.mytestmodule;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.sharelibrary.ServiceFactory;

public class MainActivity extends AppCompatActivity {
    private Button btn_start_push;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_start_push = findViewById(R.id.btn_start_push);

        btn_start_push.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ServiceFactory.getInstance().getMyPushService().startMyPushMainActivity(MainActivity.this, null);
            }
        });

        FragmentManager fragmentManager = getSupportFragmentManager();
        Bundle bundle = new Bundle();
        ServiceFactory.getInstance().getMyPushService().newPushFragment(fragmentManager, R.id.f_push, bundle);


    }
}
