package ru.netology.domain;

public class Radio {
    private int currentVolume;
    private int currentStationNumber;

    public int getCurrentStationNumber() {
        return currentStationNumber;
    }
    public void setCurrentStationNumber(int newStationNumber) {
        if (newStationNumber < 0) {
            return;
        }
        if (newStationNumber > 9) {
            return;
        }
        this.currentStationNumber = newStationNumber;
    }
    public void nextStationNumber() {
        if (currentStationNumber == 9) {
            this.currentStationNumber = 0;
            return;
        }
        this.currentStationNumber = currentStationNumber +1;
    }
    public void prevStationNumber() {
        if (currentStationNumber == 0) {
            this.currentStationNumber = 9;
            return;
        }
        this.currentStationNumber = currentStationNumber - 1;
    }
    public int getCurrentVolume() {
        return currentVolume;
    }
    public void setCurrentVolume(int newVolume) {
        if (newVolume < 0) {
            return;
        }
        if (newVolume > 10) {
            return;
        }
        this.currentVolume = newVolume;
    }
    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }
    public void turnDownVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
