package ru.netology.domain;

public class Radio {
    int currentNumberRadioStation;
    int volume;


    public void next() {
        if (currentNumberRadioStation < 9) {
            currentNumberRadioStation = currentNumberRadioStation + 1;
        } else {
            currentNumberRadioStation = 0;
        }

    }

    public void prev() {
        if (currentNumberRadioStation > 0) {
            currentNumberRadioStation = currentNumberRadioStation - 1;
        } else {
            currentNumberRadioStation = 9;
        }
    }

    public void setStation(int number) {
        if (number >= 0 && number <= 9) {
            currentNumberRadioStation = number;
        }
    }


    public void increaseVolume() {
        if (volume < 10) {
            volume = volume + 1;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume = volume - 1;
        }
    }
}








