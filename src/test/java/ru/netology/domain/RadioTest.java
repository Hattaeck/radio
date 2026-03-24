package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void nextStation() {
        Radio radio = new Radio();
        radio.setStation(9);
        radio.next();

        int actual = radio.currentNumberRadioStation;
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void nextStationNotMax() {
        Radio radio = new Radio();
        radio.setStation(5);
        radio.next();

        int actual = radio.currentNumberRadioStation;
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    void prevStation() {
        Radio radio = new Radio();
        radio.setStation(7);
        radio.prev();

        int actual = radio.currentNumberRadioStation;
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    void prevStationMin() {
        Radio radio = new Radio();
        radio.setStation(0);
        radio.prev();

        int actual = radio.currentNumberRadioStation;
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void validStation() {
        Radio radio = new Radio();
        radio.setStation(5);

        int actual = radio.currentNumberRadioStation;
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    void invalidStationAboveMax() {
        Radio radio = new Radio();
        radio.setStation(22);

        int actual = radio.currentNumberRadioStation;
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void validStationMin() {
        Radio radio = new Radio();
        radio.setStation(-1);

        int actual = radio.currentNumberRadioStation;
        int expected = 0;

        assertEquals(expected, actual);
    }


    @Test
    void increaseVolume() {
        Radio radio = new Radio();
        radio.volume = 5;
        radio.increaseVolume();

        int actual = radio.volume;
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeMax() {
        Radio radio = new Radio();
        radio.volume = 10;
        radio.increaseVolume();

        int actual = radio.volume;
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolume() {
        Radio radio = new Radio();
        radio.volume = 5;
        radio.decreaseVolume();

        int actual = radio.volume;
        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolumeMax() {
        Radio radio = new Radio();
        radio.volume = 0;
        radio.decreaseVolume();

        int actual = radio.volume;
        int expected = 0;

        assertEquals(expected, actual);
    }
}







