package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Radio {
    private int currentVolume;
    private int currentStationNumber;
    private int countStations;


    public void setCurrentStationNumber(int newStationNumber) {
        if (newStationNumber < 0) {
            return;
        }
        if (newStationNumber > this.getCountStations() -1) {
            return;
        }
        this.currentStationNumber = newStationNumber;
    }
    public void nextStationNumber() {
        if (currentStationNumber == this.getCountStations() -1) {
            this.currentStationNumber = 0;
            return;
        }
        this.currentStationNumber = currentStationNumber +1;
    }
    public void prevStationNumber() {
        if (currentStationNumber == 0) {
            this.currentStationNumber = this.getCountStations() -1;
            return;
        }
        this.currentStationNumber = currentStationNumber - 1;
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
