package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private boolean ischeeseadded;

    private boolean istoppingsadded;

    private boolean isbagadded;

    private boolean isbillgenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg)
        {
            price = 300;
        }
        else {
           price = 400;
        }
        bill = "Base Price Of The Pizza:"+price+"/n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(ischeeseadded==false)
        {
            ischeeseadded=true;
            price = price+80;
        }
        bill = "Extra Cheese Added:80"+"/n";
    }

    public void addExtraToppings(){
        // your code goes here
        int toppings_price=0;
        if(istoppingsadded==false)
        {
            istoppingsadded=true;
            if(isVeg)
            {
                toppings_price = 70;
                price = price+70;
            }
            else {
                toppings_price = 120;
                price = price+120;
            }
        }
        bill = bill+"Extra Toppings Added:"+toppings_price+"/n";
    }

    public void addTakeaway(){
        // your code goes here
        if(isbagadded==false)
        {
            isbagadded=true;
            price = price+20;
        }
        bill = bill+"Paperbag Added:20"+"/n";
    }

    public String getBill(){
        // your code goes here
        if(isbillgenerated==false)
        {
            isbillgenerated=true;
            bill = bill+"Total Price:"+price;

        }
        return this.bill;
    }
}
