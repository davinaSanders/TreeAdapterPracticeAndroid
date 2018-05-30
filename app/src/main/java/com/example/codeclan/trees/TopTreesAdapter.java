package com.example.codeclan.trees;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by davinasanders on 30/05/2018.
 */

public class TopTreesAdapter extends ArrayAdapter<Tree> {
    // this inherits from a subclass of baseAdapter called ArrayAdapter of type Tree object in this case.
    // you can construct it in many different ways via constructor overloading. In this case we will use the
    // (Context context, int resource, List<T> objects)
    // context is also an object of an abstract class.

    public TopTreesAdapter(Context context, ArrayList<Tree> trees) {
        super(context, 0, trees);
    }

//    @Override
//    public View getView(int position, View listItemView, ViewGroup parent){
//        if (listItemView == null) {
//            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.movies_item, parent, false);
//        }

//        Tree currentTree = getItem(position);
//        TextView ranking = listItemView.findViewById(R.id.ranking);
//        ranking.setText(currentMovie.getRanking().toString());
//
//        TextView year = listItemView.findViewById(R.id.year);
//        year.setText(currentMovie.getYear().toString());
//
//        TextView title = listItemView.findViewById(R.id.title);
//        title.setText(currentMovie.getTitle().toString());
//
//        listItemView.setTag(currentMovie);
//
//        return listItemView;
    }
}
