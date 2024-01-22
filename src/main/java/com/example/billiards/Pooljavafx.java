package com.example.billiards;

import javafx.application.Application;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

//**************************************************************************************************
//Pooljavafx.java                                   Author: Jordan Bailey
//
//Create image using atleast 16 javashapes
//**************************************************************************************************
public class Pooljavafx extends Application
{
    public void  start(Stage primaryStage){



       //Pool table green center_________________________________________________________________________________
        Rectangle table = new Rectangle(50,0,400,600);
        table.setFill(Color.rgb(50,190,8));// (shape 1#)

        //Pool table holes___________________________________________________________________________________
        Circle hole1 = new Circle(25,0,24);
        hole1.setFill(Color.BLACK); //top left hole(#2)
        Circle hole2 = new Circle(25,250,25);
        hole1.setFill(Color.BLACK);//mid left hole (#3)
        Circle hole3 = new Circle(475,0,25);
        hole1.setFill(Color.BLACK);//top right hole (#4)
        Circle hole4 = new Circle(475,250,25);
        hole1.setFill(Color.BLACK);//mid right hole (#5)
        Circle hole5 = new Circle(475,500,25);
        hole1.setFill(Color.BLACK);//bottom right hole (#6)
        Circle hole6 = new Circle(25,500,25);
        hole1.setFill(Color.BLACK);//bottom left hole(#7)

        //Pool Balls-------------------------------------------------------------------------------
            Circle ball1 = new Circle(232,255,17);
        ball1.setFill(Color.ROYALBLUE);//top blue ball (#8)
            Circle ball2 = new Circle(250,284,17);
        ball2.setFill(Color.BLACK);//dead center 8 ball (#9)
            Circle ball3 = new Circle(266,255,17);
        ball3.setFill(Color.INDIGO);//bottom left hole (10#)
           Circle ball4 = new Circle(249,226,17);
        ball4.setFill(Color.DARKGREEN);//top center (11#)
           Circle ball5 = new Circle(216,285,17);
        ball5.setFill(Color.rgb(243,12,179));//(#12) 3rd from bottom left, (notes)experimented with rgb also
           Circle ball6 = new Circle(286,285,17); ball6.setFill(Color.rgb(218,200,5));
        Circle ball7 = new Circle(200,316,17);
        ball7.setFill(Color.RED);//(#13) bottom row left
        Circle ball8 = new Circle(235,314,17);
        ball8.setFill(Color.GRAY);//(#14) bottom 2nd left
        Circle ball9 = new Circle(269,314,17);
        ball9.setFill(Color.ORANGE);//(#15) bottom 3rd left
        Circle ball10 = new Circle(303,314,17);
        ball10.setFill(Color.PURPLE);//(#14) bottom 2nd left

        //pool ball details______________________________________________________________________________________
        Circle ballcentr1 = new Circle(232,255,10);
        //ballcentr1.setFill(Color.rgb(255,255,255)); //ballcentr title #'s corresponds with poolballs#'s (#15)
        Circle ballcentr2 = new Circle(250,284,10);
        ballcentr1.setFill(Color.WHITE);//dead center 8 ball (#16)
        Circle ballcentr3 = new Circle(266,255,10);
        ballcentr3.setFill(Color.WHITE);//bottom left hole (17#)
        Circle ballcentr4 = new Circle(249,226,10);
        ballcentr4.setFill(Color.WHITE);//top center (18#)
        Circle ballcentr5 = new Circle(216,285,10);
        ballcentr5.setFill(Color.WHITE);//(#19)
        Circle ballcentr6 = new Circle(286,285,10);
        ballcentr6.setFill(Color.WHITE); //20
        Circle ballcentr7 = new Circle(200,316,10);
        ballcentr7.setFill(Color.WHITE);//(#21) bottom row left
        Circle ballcentr8 = new Circle(235,314,10);
        ballcentr8.setFill(Color.WHITE);//(#22) bottom 2nd left
        Circle ballcentr9 = new Circle(269,314,10);
        ballcentr9.setFill(Color.WHITE);//(#23) bottom 3rd left
        Circle ballcentr10 = new Circle(303,314,10);
        ballcentr10.setFill(Color.WHITE);//(#24) bottom 2nd left

        //(notes)quite abit of difficulty sorting through code tracking down issues that messed up the image multiple times
//________________________________________________________________________________________________________________

        Group poolblls = new Group(table,hole1,hole2,hole3,hole4,hole5,hole6,ball1,ball3,ball2,ball4,ball5,ball6,
                ball7,ball8,ball9,ball10, ballcentr1,ballcentr2,ballcentr3,ballcentr4,ballcentr5,ballcentr6,
                ballcentr7,ballcentr8,ballcentr9,ballcentr10);
        //(notes) had difficulty trying to find a means to group things together, so as to not have to write/copy all 24
        // of the shapes into 'Group poolblls'. But couldnt manage to without the system turning entirely red and attempting to troubleshoot
        //to no avail.
//_____________________________________________________________________________________________________________________
        Scene game = new Scene(poolblls, 500,500, Color.SADDLEBROWN);


        primaryStage.setTitle("Billiards");
        primaryStage.setScene(game);
        primaryStage.show();
    }
}