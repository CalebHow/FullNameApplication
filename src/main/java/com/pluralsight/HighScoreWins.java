package com.pluralsight;
import java.util.Arrays;
import java.util.Scanner;

public class HighScoreWins {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
    System.out.println("Please enter tonight's score!");
    String Score = input.next();
    String[]XScore = Score.split("\\|");
    System.out.println(Arrays.toString(XScore));
    String[] Team = XScore[0].split(":");
    String[] TeamScore = XScore[1].split(":");
    int HomeScore = Integer.parseInt(TeamScore[0]);
    int AwayScore = Integer.parseInt(TeamScore[1]);

    if(HomeScore > AwayScore){
        System.out.println("Winner : Home");


    } else{
        System.out.println("Winner : Visitor");
}}}