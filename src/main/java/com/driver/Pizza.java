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
        if(isVeg){
            this.price+=300;
            this.bill="Base Price Of The Pizza: 300" + "\n";
        }
        else {
            this.price+=400;
            this.bill="Base Price Of The Pizza: 400" + "\n";
        }

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
            this.bill+="Extra Cheese Added: 80" + "\n";
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isCheeseAdded){
            if(!isToppingsAdded) {
                if(isVeg){
                    this.price+=70;
                    this.bill+= "Extra Toppings For Veg Pizza = 70" + "\n";
                }
                else {
                    this.price+=120;
                    this.bill+= "Extra Toppings For Non-veg Pizza = 120" + "\n";
                }
                isToppingsAdded=true;
            }
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAway){
            this.price+=20;
            isTakeAway=true;
            this.bill+="Paper bag Price = 20" + "\n";
        }
    }

    public String getBill(){
        // your code goes here
        this.bill+="Total Price: " +this.price;
        return this.bill;
    }
}
