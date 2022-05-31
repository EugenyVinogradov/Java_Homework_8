package ru.netology.domain;

public class Radio {
    private int currentVolume;
    private int currentStationNumber;
    private int countStations;

    public Radio(int currentVolume, int currentStationNumber, int countStations) {
        this.currentVolume = currentVolume;
        this.currentStationNumber = currentStationNumber;
        this.countStations = countStations;
    }

    public Radio() { // Используется в последнем тесте
        this.countStations = 10;
    }

    public int getCurrentStationNumber() {
        return currentStationNumber;
    }
    public void setCurrentStationNumber(int newStationNumber) {
        if (newStationNumber < 0) {
            return;
        }
        if (newStationNumber > this.countStations -1) {
            return;
        }
        this.currentStationNumber = newStationNumber;
    }
    public void nextStationNumber() {
        if (currentStationNumber == this.countStations -1) {
            this.currentStationNumber = 0;
            return;
        }
        this.currentStationNumber = currentStationNumber +1;
    }
    public void prevStationNumber() {
        if (currentStationNumber == 0) {
            this.currentStationNumber = this.countStations -1;
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
        if (newVolume > 100) {
            return;
        }
        this.currentVolume = newVolume;
    }
    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }
    public void turnDownVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
