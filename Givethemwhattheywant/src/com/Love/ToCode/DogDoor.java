package com.Love.ToCode;

import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {
    private boolean open;
    private Bark allowBark;




    public DogDoor() {
        this.open = false;
    }

    public void open() {
        System.out.println("the dog door opens");
        this.open = true;
        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("inside run()");
               close();
                timer.cancel();
            }
        },5000);

    }

    public void close() {
        System.out.println("the dog door closes");
        open = false;
    }

    public boolean isOpen() {
        return open;
    }

    public Bark getAllowBark() {
        return allowBark;
    }

    public void setAllowBark(Bark allowBark) {
        this.allowBark = allowBark;
    }
}


