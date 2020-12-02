package com.techreturners.cats;

public class DomesticCat extends CatParent {
    
    public DomesticCat(){
        this.setting = "domestic";
        this.asleep = false;
        this.averageHeight = 23;
    }

    public String eat() {
        if (Math.random() > 0.8)
        {
            return "It will do I suppose";
        }        
        return "Purrrrrrr";
    };

    public void run() {};
}
