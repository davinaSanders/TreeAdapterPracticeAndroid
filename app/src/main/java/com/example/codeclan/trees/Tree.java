package com.example.codeclan.trees;

import java.io.Serializable;

/**
 * Created by davinasanders on 30/05/2018.
 */

public class Tree implements Serializable{
    private Integer ranking;
    private String type;
    private String origin;

    public Tree(Integer ranking, String type, String origin) {
        this.ranking = ranking;
        this.type = type;
        this.origin = origin;

    }

    public Integer getRanking() {
       return this.ranking;
    }

    public String getType() {
        return this.type;
    }

    public String getOrigin() {
        return this.origin;
    }


}
