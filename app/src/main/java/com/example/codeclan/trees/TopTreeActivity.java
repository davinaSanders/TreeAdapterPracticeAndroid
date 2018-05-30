package com.example.codeclan.trees;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class TopTreeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_tree);

        TopTree topTree = new TopTree();
        ArrayList<Tree> treeList = topTree.getList();

        TopTreesAdapter treeAdapter = new TopTreesAdapter(this, treeList);


        ListView listView = findViewById(R.id.treeListID);
        listView.setAdapter(treeAdapter);
    }

    public void onListItemClick(View listItem) {
        Tree tree = (Tree)listItem.getTag();
        // (Tree) this is a cast. you want it to be treated as this specific type of object
        Log.d("Tree type: ", tree.getType());

        Intent intent = new Intent(this, TreeActivity.class);
        intent.putExtra("tree", tree);
        startActivity(intent);
    }
}
