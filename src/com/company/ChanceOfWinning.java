package com.company;

import java.util.Random;

public class ChanceOfWinning implements ScratchCard{
    private double pay;

    public ChanceOfWinning(double pay) {
        this.pay = pay;    }




    public void ScratchCard(){
        int c = new Random().nextInt(10);
        if (pay > 100 && pay < 1000){
            if (c < 1) {
                System.out.println("Congrats you have 10% chance of winning a scratch card");

            }
        }

        else if(pay > 1000 && pay < 3000){
            if (c < 2) {
                System.out.println("Congrats you have 20% chance of winning a scratch card");

            }
        }


       else if (pay > 3000 && pay < 5000){
           if (c < 3) {
                System.out.println("Congrats you have 30% chance of winning a scratch card");

            }
        }


       else if (pay > 5000 && pay < 10000){
            if (c < 5) {
                System.out.println("Congrats you have 50% chance of winning a scratch card");

            }
        }
       else if (pay > 10000){
           if (c < 9) {
                System.out.println("Congrats you have 100% chance of winning a scratch card");

            }
        }
    }
}
