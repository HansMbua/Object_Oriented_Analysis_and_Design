package com.Love.ToCode;

public class Bark {

    private String sound;

    public Bark(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    public boolean equals(Object bark){
        if (bark instanceof Bark){
            Bark otherBack = (Bark) bark;
            if (this.sound.equalsIgnoreCase(otherBack.sound)){
                return true;
            }
        }

        return false;
    }

}
