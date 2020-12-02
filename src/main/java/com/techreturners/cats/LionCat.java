package com.techreturners.cats;

public class LionCat extends CatParent {

    public LionCat() {
        this.setting = "wild";
        this.asleep = false;
        this.averageHeight = 1100;
    }

    public String eat() {
       return "Roar!!!!";
    };

    public void run() {
    };
}
