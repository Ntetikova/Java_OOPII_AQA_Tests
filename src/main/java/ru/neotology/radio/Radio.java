package ru.neotology.radio;

public class Radio {

    public int minRadioStation = 0;
    public int defaultRadioStation = 10;
    public int maxRadioStation = defaultRadioStation - 1;
    public int currentRadioStation;
    public int minVolume = 0;
    public int maxVolume = 100;
    public int currentVolume;


    public Radio(int defaultRadioStation) {
        this.maxRadioStation = defaultRadioStation - 1;
    }
    public Radio() {

    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation > maxRadioStation) {
            newCurrentRadioStation = minRadioStation;
        }
        if (newCurrentRadioStation < minRadioStation) {
            newCurrentRadioStation = maxRadioStation;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void increaseNextRadioStation(int nextCurrentRadioStation) {
        if (nextCurrentRadioStation < maxRadioStation) {
            nextCurrentRadioStation++;
        } else {
            nextCurrentRadioStation = minRadioStation;
        }
        this.currentRadioStation = nextCurrentRadioStation;
    }


    public void decreasePevRadioStation(int pevCurrentRadioStation) {
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

    public void decreaseCurrentVolume(int decreaseCurrentVolume) {
        if (decreaseCurrentVolume >= maxVolume) {
            decreaseCurrentVolume--;
        } else {
            decreaseCurrentVolume = minVolume;
        }
        this.currentVolume = decreaseCurrentVolume;
    }
}
