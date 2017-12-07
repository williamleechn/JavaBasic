/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import java.util.Random;

/**
 *
 * @author libin
 */
public class Game {

    String player1, player2;
    int countPlayer1 = 0, countPlayer2 = 0;

    public Game(String player1, String player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void rollDice() {
        Random r = new Random();
        int display1 = r.nextInt(6) + 1;
        int display2 = r.nextInt(6) + 1;
        countPlayer1 = countPlayer1 + display1;
        countPlayer2 = countPlayer2 + display2;
    }

    public void showScore() {
        System.out.println("Player 1 " + player1 +" score is  " + countPlayer1);
        System.out.println("Player 1 " + player2 +" score is  " + countPlayer2);
    }
}
