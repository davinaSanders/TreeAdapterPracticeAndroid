package com.example.codeclan.trees;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class TreeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tree);

        Intent intent = getIntent();
        Tree tree = (Tree)intent.getSerializableExtra("tree");
        // casting
        Log.d("TreeActivity: ", tree.getType());
    }
}
