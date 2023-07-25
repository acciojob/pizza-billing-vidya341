package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private boolean ischeeseadded;

    private boolean istoppingsadded;

    private boolean isbagadded;

    private boolean isbillgenerated;

    private int cheeseprice;
    private int toppingsprice;

    private int paperprice;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg)
        {
            price = 300;
            toppingsprice = 70;
        }
        else {
           price = 400;
           toppingsprice = 120;
        }
        cheeseprice =80;
        paperprice = 20;
        bill = "Base Price Of The Pizza: "+price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(ischeeseadded==false)
        {
            ischeeseadded=true;
            price = price+cheeseprice;
        }
        bill = bill+"Extra Cheese Added: "+cheeseprice+"\n";
    }

    public void addExtraToppings(){
        // your code goes here

        if(istoppingsadded==false)
        {
            istoppingsadded=true;
            price = price+toppingsprice;
        }
        bill = bill+"Extra Toppings Added: "+toppingsprice+"\n";
    }

    public void addTakeaway(){
        // your code goes here
        if(isbagadded==false)
        {
            isbagadded=true;
            price = price+20;
        }
        bill = bill+"Paperbag Added: 20"+"\n";
    }

    public String getBill(){
        // your code goes here
        if(isbillgenerated==false)
        {
            isbillgenerated=true;
            bill = bill+"Total Price: "+price;

        }
        return this.bill;
    }
}
