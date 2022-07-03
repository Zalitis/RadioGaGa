public class Radio {
    private int soundVolume;
    private int stationNumber;
    protected int stationMax = 9;

    public Radio() {
        stationMax = 9;
    }

    public Radio(int stationCount) {
        stationMax = stationCount - 1;
    }
    public int getSoundVolume() {
        return soundVolume;
    }
    public void setSoundVolume(int newSoundVolume) {
        if (newSoundVolume < 0) {
            return;
        } else if (newSoundVolume > 10) {
            return;
        }
        soundVolume = newSoundVolume;
    }
    public void increaseVolume() {
        if (soundVolume < 10) {
            soundVolume = soundVolume + 1;
        } else {
            soundVolume = 10;
        }
    }

    public void lowerTheVolume() {
        if (soundVolume > 0) {
            soundVolume = soundVolume - 1;
        } else {
            soundVolume = 0;
        }
    }

    public int getStationNumber() {
        return stationNumber;
    }

    public void setStationNumber(int newStationNumber) {
        if (newStationNumber < 0) {
            return;
        } else if (newStationNumber > stationMax) {
            return;
        }
        stationNumber = newStationNumber;
    }

    public void nextStation() {
        if (stationNumber < stationMax) {
            stationNumber = stationNumber + 1;
        } else {
            stationNumber = 0;
        }
    }

    public void previousStation() {
        if (stationNumber > 0) {
            stationNumber = stationNumber - 1;
        } else {
            stationNumber = 9;
        }
    }


}
