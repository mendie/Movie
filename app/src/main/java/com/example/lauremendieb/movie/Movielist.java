package com.example.lauremendieb.movie;

import java.util.ArrayList;

/**
 * Created by lauremendieb on 19/07/2017.
 */

public class Movielist {
public String title;
public String posterUrl;
public float score;

    public Movielist(float score, String title, String posterUrl) {
        this.score = score;
        this.title = title;
        this.posterUrl = posterUrl;
    }


    public String getscoreLabel(){
    return score +"";
}


//Return 3 movies

    public static ArrayList<Movielist>  getFakeMovie(){
    }
    ArrayList<Movielist> movielists = new ArrayList<>();
    movielists.add(new Movielist("la Reine Des Neiges","",90.0f));
    movielists.add(new Movielist("Nemo","",98.5f));
    movielists.add(new Movielist("Cars","",92,0f));
    return Movielist;

}

