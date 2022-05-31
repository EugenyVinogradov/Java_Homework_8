package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class RadioTest {
    Radio radio = new Radio(0, 0, 10);
    @Test
    public void setupNumberStationCorrectNew() {
        radio.setCurrentStationNumber(5);
        radio.getCountStations();
        int expected = 5;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }
    @Test
    public void returnNumberStation() {
        int expected = 0;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }
    @Test
    public void setupNumberStationCorrect() {
        Radio radio = new Radio();
        radio.setCountStations(10);
        radio.setCurrentStationNumber(5);
        int expected = 5;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }
    @Test
    public void setupNumberStationLowerCorrect() {
        radio.setCurrentStationNumber(-1);
        int expected = 0;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }
    @Test
    public void setupNumberStationUpperCorrect() {
        radio.setCurrentStationNumber(11);
        int expected = 0;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }
    @Test
    public void setupNumberStationLowBorder() {
        radio.setCurrentStationNumber(0);
        int expected = 0;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }
    @Test
    public void setupNumberStationUpBorder() {
        radio.setCurrentStationNumber(9);
        int expected = 9;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }
    @Test
    public void setupNumberStationUpperLowBorder() {
        radio.setCurrentStationNumber(1);
        int expected = 1;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }
    @Test
    public void setupNumberStationLowerUpBorder() {
        radio.setCurrentStationNumber(8);
        int expected = 8;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }
    @Test
    public void nextNumberStationCorrect() {
        radio.setCurrentStationNumber(5);
        radio.nextStationNumber();
        int expected = 6;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }
    @Test
    public void nextNumberStationLowBorder() {
        radio.setCurrentStationNumber(0);
        radio.nextStationNumber();
        int expected = 1;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }
    @Test
    public void nextNumberStationUpperLowBorder() {
        radio.setCurrentStationNumber(1);
        radio.nextStationNumber();
        int expected = 2;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }
    @Test
    public void nextNumberStationUpBorder() {
        radio.setCurrentStationNumber(9);
        radio.nextStationNumber();
        int expected = 0;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }
    @Test
    public void nextNumberStationLowerUpBorder() {
        radio.setCurrentStationNumber(8);
        radio.nextStationNumber();
        int expected = 9;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }
    @Test
    public void nextNumberStationLowerLowBorder() {
        radio.setCurrentStationNumber(-1);
        radio.nextStationNumber();
        int expected = 1;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }
    @Test
    public void nextNumberStationUpperUpBorder() {
        radio.setCurrentStationNumber(10);
        radio.nextStationNumber();
        int expected = 1;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }
    @Test
    public void prevNumberStationCorrect() {
        radio.setCurrentStationNumber(5);
        radio.prevStationNumber();
        int expected = 4;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }
    @Test
    public void prevNumberStationLowBorder() {
        radio.setCurrentStationNumber(0);
        radio.prevStationNumber();
        int expected = 9;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }
    @Test
    public void prevNumberStationUpperLowBorder() {
        radio.setCurrentStationNumber(1);
        radio.prevStationNumber();
        int expected = 0;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }
    @Test
    public void prevNumberStationLowerLowBorder() {
        radio.setCurrentStationNumber(-1);
        radio.prevStationNumber();
        int expected = 9;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }
    @Test
    public void prevNumberStationUpBorder() {
        radio.setCurrentStationNumber(9);
        radio.prevStationNumber();
        int expected = 8;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }
    @Test
    public void prevNumberStationLowerUpBorder() {
        radio.setCurrentStationNumber(8);
        radio.prevStationNumber();
        int expected = 7;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }
    @Test
    public void prevNumberStationUpperUpBorder() {
        radio.setCurrentStationNumber(10);
        radio.prevStationNumber();
        int expected = 9;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }
    @Test
    public void increaseVolumeCorrect() {
        radio.setCurrentVolume(5);
        radio.increaseVolume();
        int expected = 6;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void increaseVolumeUpBorder() {
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void increaseVolumeUpperUpBorder() {
        radio.setCurrentVolume(101);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void increaseVolumeLowerUpBorder() {
        radio.setCurrentVolume(99);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void increaseVolumeLowBorder() {
        radio.setCurrentVolume(0);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void increaseVolumeUpperLowBorder() {
        radio.setCurrentVolume(1);
        radio.increaseVolume();
        int expected = 2;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void increaseVolumeLowerLowBorder() {
        radio.setCurrentVolume(-1);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void turnDownVolumeCorrect() {
        radio.setCurrentVolume(5);
        radio.turnDownVolume();
        int expected = 4;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void turnDownVolumeLowBorder() {
        radio.setCurrentVolume(0);
        radio.turnDownVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void turnDownVolumeLowerLowBorder() {
        radio.setCurrentVolume(-1);
        radio.turnDownVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void turnDownVolumeUpperLowBorder() {
        radio.setCurrentVolume(1);
        radio.turnDownVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void turnDownVolumeUpBorder() {
        radio.setCurrentVolume(100);
        radio.turnDownVolume();
        int expected = 99;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void turnDownVolumeUpperUpBorder() {
        radio.setCurrentVolume(101);
        radio.turnDownVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void turnDownVolumeLowerUpBorder() {
        radio.setCurrentVolume(99);
        radio.turnDownVolume();
        int expected = 98;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
}
