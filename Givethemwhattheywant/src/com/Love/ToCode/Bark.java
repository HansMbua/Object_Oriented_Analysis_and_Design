package com.Love.ToCode;


public class Bark {

    private String sound;

    public Bark(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public boolean equals(String bark){


        if (bark.equalsIgnoreCase(getSound())){
          return true;
        }

        return false;
    }

}
