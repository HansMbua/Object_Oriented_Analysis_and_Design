package com.Love.ToCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {
    private boolean open;
    private List<Bark> allowBarks;




    public DogDoor() {
        this.open = false;
        allowBarks = new ArrayList<>();
    }

    public void open() {
        System.out.println("the dog door opens");
        this.open = true;
        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {

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



    public List<Bark> getAllowBarks() {
        return allowBarks;
    }

    public void addAllowBarks(Bark allowBarks) {
        this.allowBarks.add(allowBarks);
    }
}


