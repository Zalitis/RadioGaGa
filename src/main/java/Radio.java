public class Radio {
    public int soundVolume;
    public int stationNumber;
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
        } else if (newStationNumber > 9) {
            return;
        }
        stationNumber = newStationNumber;
    }

    public void nextStation() {
        if (stationNumber < 9) {
            stationNumber = stationNumber + 1;
        } else stationNumber = 0;
    }
    public void previousStation() {
        if (stationNumber > 0) {
            stationNumber = stationNumber - 1;
        } else stationNumber = 9;
    }



}
