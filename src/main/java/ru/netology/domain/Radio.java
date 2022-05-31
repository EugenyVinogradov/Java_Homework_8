package ru.netology.domain;

public class Radio {
    private int currentVolume;
    private int currentStationNumber;
    private int countStations;

    public int getCountStations() {
        return countStations;
    }

    public void setCountStations(int countStations) {
        this.countStations = countStations;
    }

    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public void setCurrentStationNumber(int newStationNumber) {
        if (newStationNumber < 0) {
            return;
        }
        if (newStationNumber > getCountStations() - 1) {
            return;
        }
        this.currentStationNumber = newStationNumber;
    }

    public void nextStationNumber() {
        if (currentStationNumber == getCountStations() - 1) {
            this.currentStationNumber = 0;
            return;
        }
        this.currentStationNumber = currentStationNumber + 1;
    }

    public void prevStationNumber() {
        if (currentStationNumber == 0) {
            this.currentStationNumber = getCountStations() - 1;
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

    public Radio(int countStations) {
        this.countStations = countStations;
    }

    public Radio() { // Используется в тесте setupNumberStationUpperCorrect
        this.countStations = 10;
    }
}
