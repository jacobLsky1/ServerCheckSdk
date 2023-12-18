package com.dev.android.appConfigSdk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NetworkErrorActivity extends AppCompatActivity {


    private NetworkErrorCallback callback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_network_error);

        // Retrieve the callback reference
        callback = (NetworkErrorCallback) getIntent().getSerializableExtra("callback");

        // Example: Call the callback when a retry button is clicked
        Button retryButton = findViewById(R.id.tryAgainButton);
        retryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (callback != null) {
                    callback.onRetry();
                }
                finish(); // Close the NetworkErrorActivity
            }
        });
    }
}

