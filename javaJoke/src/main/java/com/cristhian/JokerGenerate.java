package com.cristhian;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Cristhian
 */
public class JokerGenerate {

    /**
     *
     */
    private List<String> jokers;

    /**
     *
     */
    public JokerGenerate() {
    }

    /**
     *
     */
    public void loadJoker() {
        jokers = new ArrayList<String>();
        jokers.add("chamo");
        jokers.add("wea");
        jokers.add("fome");
        jokers.add("cagao");
        jokers.add("pinche");
        jokers.add("mamaburra");
        jokers.add("cumbia");
        jokers.add("bombon");
        jokers.add("envidioso");
    }

    /**
     * @return
     */
    public String getJoker() {
        loadJoker();
        int jokerSize = jokers.size();
        int randomPosition = (int) (Math.random() * jokerSize + 0);
        return jokers.get(randomPosition);
    }

    /**
     * @return
     */
    public List<String> getJokers() {
        return jokers;
    }

    /**
     * @param jokers
     */
    public void setJokers(List<String> jokers) {
        this.jokers = jokers;
    }


    public static void main(String[] args) {
        JokerGenerate jokerGenerate = new JokerGenerate();
        System.out.println(jokerGenerate.getJoker());
    }
}

