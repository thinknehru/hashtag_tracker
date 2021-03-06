package com.thinknehru.hashtag_tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.navigateToSearchButton)
    Button mNavigateToSearchButton;
    @BindView(R.id.appNameTextView)
    TextView mAppNameTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        mNavigateToSearchButton.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        if(v == mNavigateToSearchButton) {
            Intent intent = new Intent(MainActivity.this, SearchHashtagActivity.class);
            startActivity(intent);
        }

    }

}
