package ru.neotology.radio;

public class Radio {
    private int currentRadioStation;
    private int minRadioStation = 0;
    private int maxRadioStation = 9;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 10;


    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newRadioStation) {
        if (newRadioStation < minRadioStation) {
            newRadioStation = maxRadioStation;
        }
        if (newRadioStation > maxRadioStation) {
            newRadioStation = minRadioStation;
        }
        this.currentRadioStation = newRadioStation;
    }
    public  void  increaseRadioStation() {
        int next = currentRadioStation + 1;
        setCurrentRadioStation(next);
    }
    public void decreaseRadioStation() {
        int pev = currentRadioStation - 1;
        setCurrentRadioStation(pev);
    }
    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
           newCurrentVolume = maxVolume;
        }
        this.currentVolume = newCurrentVolume;
    }
    public  void  increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        } else {
            this.currentVolume = maxVolume;
        }
    }
    public void decreaseVolume() {
        int pev = currentVolume - 1;
        setCurrentVolume(pev);
    }

   /* public void decreasePevRadioStation(int pevCurrentRadioStation) {
        if (pevCurrentRadioStation < minRadioStation) {
            currentRadioStation = maxRadioStation;
        }
        if (pevCurrentRadioStation > maxRadioStation) {
            currentRadioStation = minRadioStation;
        }
    }

    public void setCurrentVolume(int newcurrentVolume) {
        if (newcurrentVolume > maxVolume) {
            newcurrentVolume = maxVolume;
        }
        if (newcurrentVolume < minVolume) {
            newcurrentVolume = minVolume;
        }
        this.currentVolume = newcurrentVolume;
    }

    public void increaseCurrentVolume(int increaseCurrentVolume) {
        if (increaseCurrentVolume < maxVolume) {
            increaseCurrentVolume++;
        } else {
            increaseCurrentVolume = maxVolume;
        }
        this.currentVolume = increaseCurrentVolume;
    }

    public void decreaseCurrentVolume(int decreasecurrentVolume) {
        if (decreasecurrentVolume >= maxVolume) {
            decreasecurrentVolume--;
        } else {
            decreasecurrentVolume = minVolume;
        }
        currentVolume = decreasecurrentVolume;
    }*/
}
