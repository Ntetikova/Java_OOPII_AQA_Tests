package ru.neotology.radio;

public class Radio {
    public int minRadioStation = 0;
    public int maxRadioStation = 9;
    public int currentRadioStation;
    public int minVolume = 0;
    public int maxVolume = 10;
    public int currentVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation > maxRadioStation) {
            newCurrentRadioStation = minRadioStation ;
        }
        if (newCurrentRadioStation < minRadioStation) {
            newCurrentRadioStation = maxRadioStation;
        }
        this.currentRadioStation = newCurrentRadioStation;
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

    public void decreaseCurrentVolume(int decreasecurrentVolume) {
        if (decreasecurrentVolume >= maxVolume) {
            decreasecurrentVolume--;
        } else {
            decreasecurrentVolume = minVolume;
        }
        currentVolume = decreasecurrentVolume;
    }
}
