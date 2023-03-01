package ru.neotology.radio;

public class Radio {
    private int minRadioStation = 0;
    private int defaultRadioStation = 10;
    private int maxRadioStation = defaultRadioStation - 1;
    private int currentRadioStation;

    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume;

    public Radio(int defaultRadioStation) {
        this.maxRadioStation = defaultRadioStation - 1;
    }

    public Radio() {

    }

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

    public void increaseRadioStation() {
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

    public void increaseVolume() {
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

}
