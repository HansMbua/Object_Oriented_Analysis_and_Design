package com.Love.ToCode;

import java.util.*;

public class BarkRecognizer {
    private DogDoor door;

    public BarkRecognizer(DogDoor door) {
        this.door = door;
    }

    public boolean recognize(String bark){
        System.out.println("BarkRecognizer: Head a "+bark);

        //get a list of barks that are allowed so i can compare them
        List<Bark> allowedBarks = door.getAllowBarks();

        //scan through the list
        for (Iterator i = allowedBarks.iterator(); i.hasNext();){
            // get objects and save them to a new bark object
            Bark allowedBark = (Bark)i.next();
            //compare the list of bark to the new bark
            if(allowedBark.equals(bark)){
                System.out.println("Dog Recognized! ");
                door.open();
                return true;
            }
        }

        return false;
    }

}
