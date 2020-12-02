package com.techreturners.cats;

interface Cat {
 public String eat();
 public boolean isAsleep();
 public void run();
 public void goToSleep();
 public void wakeUp();
 public int getAverageHeight();
 public String getSetting();
}

abstract class CatParent implements Cat {

    protected boolean asleep;
    protected int averageHeight;
    protected String setting;

    public abstract String eat();

    public void goToSleep() {
        asleep = true;
    };

    public void wakeUp() {
        asleep = false;
    }

    public abstract void run();

    public boolean isAsleep() {
        return asleep;
    };

    public int getAverageHeight() {
        return averageHeight;
    };

    public String getSetting() {
        return setting;
    };
} 
