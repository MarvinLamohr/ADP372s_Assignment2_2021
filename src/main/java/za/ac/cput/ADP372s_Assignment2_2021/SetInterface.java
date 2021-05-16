package za.ac.cput.ADP372s_Assignment2_2021;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetInterface {

    private String play = "";

    public String getPlay() {
        return play;
    }

    public void setPlay(String play) {
        this.play = play;
    }


    Set <String> setPlay = new LinkedHashSet<>();

    public void addSet(String set){

        setPlay.add("1");
        setPlay.add("2");
        setPlay.add("3");
        setPlay.add("4");
        setPlay.add("5");
        setPlay.add("6");
        setPlay.add("5");

        System.out.println(set);

    }

    public void deleteSet(String set){

        setPlay.remove(6);

        System.out.println("After removing " +set+ " there will be 6 values left");

        System.out.println(set);

    }

    public void findSet(){

        System.out.println(setPlay);

    }

}
