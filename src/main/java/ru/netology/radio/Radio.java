package ru.netology.radio;

public class Radio {
    private int currentRadioStation;
    private int numberOfRadioStations;
    private int currentVolume;

    public Radio() {
        this.numberOfRadioStations = 10;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            currentRadioStation = numberOfRadioStations - 1;
        }
        if (currentRadioStation > numberOfRadioStations - 1) {
            currentRadioStation = 0;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void increaseRadioStation() {
        if (currentRadioStation < numberOfRadioStations - 1) {
            currentRadioStation = currentRadioStation + 1;
        } else currentRadioStation = 0;
    }

    public void decreaseRadioStation() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        } else currentRadioStation = numberOfRadioStations - 1;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public Radio(int numberOfRadioStations) {
        this.numberOfRadioStations = numberOfRadioStations;
    }

    public int getNumberOfRadioStations() {
        return numberOfRadioStations;
    }

    public void setNumberOfRadioStations(int numberOfRadioStations) {
        if (numberOfRadioStations < 0) {
            return;
        }
        this.numberOfRadioStations = numberOfRadioStations;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        int newCurrentVolume = currentVolume + 1;
        setCurrentVolume(newCurrentVolume);
    }

    public void decreaseVolume() {
        int newCurrentVolume = currentVolume - 1;
        setCurrentVolume(newCurrentVolume);
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
}