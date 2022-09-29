package com.Love.ToCode;

import java.util.Timer;
import java.util.TimerTask;

public class BarkRecognizer {
    private DogDoor door;

    public BarkRecognizer(DogDoor door) {
        this.door = door;
    }

    public void recognize(String bark){
        System.out.println("BarkRecognizer: Head a "+bark);

        //getAllowBark() method returns a back and its use to compare the other barks
       if (door.getAllowBark().equals(bark)) {
            door.open();

        } else {
            System.out.println("this dog is not allowed ");


        }
    }

}
