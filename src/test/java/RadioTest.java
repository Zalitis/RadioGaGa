import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void ifVolumeMax() {
        Radio radio = new Radio();
        radio.setSoundVolume(15);
        int expected = 0;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void ifVolumeMin() {
        Radio radio = new Radio();
        radio.setSoundVolume(-15);
        int expected = 0;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldVolumePlus() {
        Radio radio = new Radio();
        radio.setSoundVolume(6);
        radio.increaseVolume();
        int expected = 7;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void ifSound10() {
        Radio radio = new Radio();
        radio.setSoundVolume(10);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldVolumeMinus() {
        Radio radio = new Radio();
        radio.setSoundVolume(5);
        radio.lowerTheVolume();
        int expected = 4;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void ifSound0() {
        Radio radio = new Radio();
        radio.setSoundVolume(0);
        radio.lowerTheVolume();
        int expected = 0;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void ifYouTurnOnStation20() {
        Radio radio = new Radio();
        radio.setStationNumber(20);
        int expected = 0;
        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void ifYouTurnOnStationMinus() {
        Radio radio = new Radio();
        radio.setStationNumber(-20);
        int expected = 0;
        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextStation() {
        Radio radio = new Radio();
        radio.setStationNumber(3);
        radio.nextStation();
        int expected = 4;
        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void ifStation9Next() {
        Radio radio = new Radio();
        radio.setStationNumber(9);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void ifStation0Previous() {
        Radio radio = new Radio();
        radio.setStationNumber(0);
        radio.previousStation();
        int expected = 9;
        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void PreviousStation() {
        Radio radio = new Radio();
        radio.setStationNumber(6);
        radio.previousStation();
        int expected = 5;
        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testFirst() {
        Radio radio = new Radio(19);
        radio.setStationNumber(15);
        int expected = 15;
        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }
}
