package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    @Test
    public void returnNumberStation() {
        Radio radio = new Radio();
        int expected = 0;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }
    @Test
    public void setupNumberStationCorrect() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(5);
        int expected = 5;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }
    @Test
    public void setupNumberStationLowerCorrect() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(-1);
        int expected = 0;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }
    @Test
    public void setupNumberStationUpperCorrect() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(11);
        int expected = 0;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }
    @Test
    public void setupNumberStationLowBorder() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(0);
        int expected = 0;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }
    @Test
    public void setupNumberStationUpBorder() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(9);
        int expected = 9;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }
    @Test
    public void setupNumberStationUpperLowBorder() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(1);
        int expected = 1;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }
    @Test
    public void setupNumberStationLowerUpBorder() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(8);
        int expected = 8;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }
    @Test
    public void nextNumberStationCorrect() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(5);
        radio.nextStationNumber();
        int expected = 6;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }
    @Test
    public void nextNumberStationLowBorder() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(0);
        radio.nextStationNumber();
        int expected = 1;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }
    @Test
    public void nextNumberStationUpperLowBorder() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(1);
        radio.nextStationNumber();
        int expected = 2;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }
    @Test
    public void nextNumberStationUpBorder() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(9);
        radio.nextStationNumber();
        int expected = 0;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }
    @Test
    public void nextNumberStationLowerUpBorder() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(8);
        radio.nextStationNumber();
        int expected = 9;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }
    @Test
    public void nextNumberStationLowerLowBorder() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(-1);
        radio.nextStationNumber();
        int expected = 1;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }
    @Test
    public void nextNumberStationUpperUpBorder() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(10);
        radio.nextStationNumber();
        int expected = 1;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }
    @Test
    public void prevNumberStationCorrect() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(5);
        radio.prevStationNumber();
        int expected = 4;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }
    @Test
    public void prevNumberStationLowBorder() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(0);
        radio.prevStationNumber();
        int expected = 9;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }
    @Test
    public void prevNumberStationUpperLowBorder() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(1);
        radio.prevStationNumber();
        int expected = 0;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }
    @Test
    public void prevNumberStationLowerLowBorder() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(-1);
        radio.prevStationNumber();
        int expected = 9;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }
    @Test
    public void prevNumberStationUpBorder() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(9);
        radio.prevStationNumber();
        int expected = 8;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }
    @Test
    public void prevNumberStationLowerUpBorder() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(8);
        radio.prevStationNumber();
        int expected = 7;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }
    @Test
    public void prevNumberStationUpperUpBorder() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(10);
        radio.prevStationNumber();
        int expected = 9;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }
    @Test
    public void increaseVolumeCorrect() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.increaseVolume();
        int expected = 6;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void increaseVolumeUpBorder() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void increaseVolumeUpperUpBorder() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void increaseVolumeLowerUpBorder() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void increaseVolumeLowBorder() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void increaseVolumeUpperLowBorder() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.increaseVolume();
        int expected = 2;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void increaseVolumeLowerLowBorder() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void turnDownVolumeCorrect() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.turnDownVolume();
        int expected = 4;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void turnDownVolumeLowBorder() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.turnDownVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void turnDownVolumeLowerLowBorder() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.turnDownVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void turnDownVolumeUpperLowBorder() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.turnDownVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void turnDownVolumeUpBorder() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.turnDownVolume();
        int expected = 9;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void turnDownVolumeUpperUpBorder() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        radio.turnDownVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void turnDownVolumeLowerUpBorder() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.turnDownVolume();
        int expected = 8;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
}
