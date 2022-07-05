package ru.netology.radioman;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int stationsQuantity = 10;

    public Radio() {
    }

    public Radio(int stationsQuantity) {
        this.stationsQuantity = stationsQuantity;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > (stationsQuantity - 1)) {
            return;
        }
        if (currentStation < 0) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getStationsQuantity() {
        return stationsQuantity;
    }

    public void increaseStation() {

        if (currentStation == (stationsQuantity - 1)) {
            setCurrentStation(0);
            return;
        }
        setCurrentStation(++currentStation);
    }

    public void prevStation() {

        if (currentStation == 0) {
            setCurrentStation(stationsQuantity - 1);
            return;
        }
        setCurrentStation(--currentStation);
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void prevVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}


