/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

/**
 *
 * @author libin
 */
public class BurgerStalls {

    int amountSold = 0;
    int stallId;

    public BurgerStalls(int stallId) {
        this.stallId = stallId;
    }

    public void sold() {
        amountSold ++;
    }

    public int getAmountSold() {
        return amountSold;
    }
}
