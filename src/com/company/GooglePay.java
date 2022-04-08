package com.company;

public class GooglePay implements Payments{
    private double pay;
    public GooglePay(double pay) {
        this.pay = pay;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public void payMoney(double amount){
        if(amount > pay) {
            amount -= pay;
            System.out.println("You paid" + pay);
            System.out.println("Your new credit card balance is: " + amount);
        }
        else try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
