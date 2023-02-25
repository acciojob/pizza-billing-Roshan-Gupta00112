package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    // created attributes
    private boolean isCheeseAdded;
    private boolean isToppingsAdded;
    private boolean isTakeAway;



    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg)this.price+=300;
        else this.price+=400;

        isCheeseAdded=false;
        isToppingsAdded=false;
        isTakeAway=false;

    }


    public boolean isCheeseAdded() {
        return isCheeseAdded;
    }

    public void setCheeseAdded(boolean cheeseAdded) {
        isCheeseAdded = cheeseAdded;
    }

    public boolean isToppingsAdded() {
        return isToppingsAdded;
    }

    public void setToppingsAdded(boolean toppingsAdded) {
        isToppingsAdded = toppingsAdded;
    }

    public boolean isTakeAway() {
        return isTakeAway=true;
        //return isTakeAway;
    }

    public void setTakeAway(boolean takeAway) {
        isTakeAway = takeAway;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isCheeseAdded){
            this.price+=80;
            isCheeseAdded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isCheeseAdded){
            if(!isToppingsAdded) {
                if(isVeg)this.price+=70;
                else this.price+=120;
                isToppingsAdded=true;
            }
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAway){
            this.price+=20;
            isTakeAway=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(isVeg) System.out.println("Base Price Of The Pizza: 300");
        else System.out.println("Base Price Of The Pizza: 400");

        if(isCheeseAdded) System.out.println("Extra Cheese Added: 80");
        if(isToppingsAdded) {
            if(isVeg) System.out.println("Extra Toppings For Veg Pizza = 70");
            else System.out.println("Extra Toppings For Non-veg Pizza = 120");
        }
        if(isTakeAway) System.out.println("Paper bag Price = 20");
        return "Total Price: " +this.price;
    }
}
