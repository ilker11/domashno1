package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        GooglePay pay1 = new GooglePay(30);
        pay1.payMoney(100);
        ChanceOfWinning c1 = new ChanceOfWinning(400);
        c1.ScratchCard();
    }
}
