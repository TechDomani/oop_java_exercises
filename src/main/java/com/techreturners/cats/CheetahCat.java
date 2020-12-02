package com.techreturners.cats;

public class CheetahCat extends CatParent {
    
    public CheetahCat(){
        this.setting = "wild";
        this.asleep = false;
        this.averageHeight = 800;
    }

    public String eat() {
        return "Zzzzzzz";
    };

    public void run() {};
}
