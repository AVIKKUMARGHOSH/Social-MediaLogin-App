package com.avikapps.socialmedialogin;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import com.avikapps.socialmedialogin.R;

public class Homepage extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);

        /* fetching the username from LoginActivity */
        String username = getIntent().getStringExtra("username");
        TextView uname = findViewById(R.id.TV_username);
        uname.setText(username);
    }
}