package com.example.codeclan.trees;

import java.util.ArrayList;

/**
 * Created by davinasanders on 30/05/2018.
 */

public class TopTree {
    private ArrayList<Tree> treeList;


    public TopTree() {
        treeList = new ArrayList<>();
        treeList.add(new Tree(1, "Pine", "Scandinavia"));
        treeList.add(new Tree(2, "Aspen", "Europe"));
        treeList.add(new Tree(3, "Cottonwood", "Northern Hemisphere"));
        treeList.add(new Tree(4, "Black Ash", "Southern Hemisphere"));
        treeList.add(new Tree(5, "Blue Popcorn", "Western Hemisphere"));
        treeList.add(new Tree(6, "Red Birch", "Eastern Hemisphere"));
        treeList.add(new Tree(7, "Silver Oak", "Everywhere"));
        treeList.add(new Tree(8, "Evergreen", "Christmas"));
        treeList.add(new Tree(9, "Basic", "Anywhere"));
        treeList.add(new Tree(10, "Invisible", "Nowhere"));
    }
    public ArrayList<Tree> getList(){
        return this.treeList;
    }
}
