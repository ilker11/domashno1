package com.company;

import java.util.Random;

public class ChanceOfWinning implements ScratchCard{
    private GooglePay googlePay;

    public ChanceOfWinning(GooglePay googlePay) {
        this.googlePay = googlePay;    }




    public void ScratchCard(){
        int c = new Random().nextInt(10);
        if (googlePay > 100 && googlePay < 1000){
            if (c < 1) {
                System.out.println("Congrats you have 10% chance of winning a scratch card");

            }
        }

        else if(googlePay > 1000 && googlePay < 3000){
            if (c < 2) {
                System.out.println("Congrats you have 20% chance of winning a scratch card");

            }
        }


       else if (googlePay > 3000 && googlePay < 5000){
           if (c < 3) {
                System.out.println("Congrats you have 30% chance of winning a scratch card");

            }
        }


       else if (googlePay > 5000 && googlePay < 10000){
            if (c < 5) {
                System.out.println("Congrats you have 50% chance of winning a scratch card");

            }
        }
       else if (googlePay > 10000){
           if (c < 9) {
                System.out.println("Congrats you have 100% chance of winning a scratch card");

            }
        }
    }
}
