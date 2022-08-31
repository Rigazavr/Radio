package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    @Test
    public void shouldSwitchingRadioStations9() {
        Radio station = new Radio();
        station.setCurrentRadioStation(9);

        int expected = 9;
        int actual = station.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchingRadioStations0() {
        Radio station = new Radio();
        station.setCurrentRadioStation(0);

        int expected = 0;
        int actual = station.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchingRadioStations5() {
        Radio station = new Radio();
        station.setCurrentRadioStation(5);

        int expected = 5;
        int actual = station.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

      @Test
    public void shouldSwitchingRadioStations10() {
        Radio station = new Radio();
        station.setCurrentRadioStation(10);

        int expected = 0;
        int actual = station.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchingRadioStationsMinus1() {
        Radio station = new Radio();
        station.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = station.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchingRadioStationsNext() {
        Radio station = new Radio();
        station.setCurrentRadioStation(8);
        station.nextStation();

        int expected = 9;
        int actual = station.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchingRadioStationsNext10() {
        Radio station = new Radio();
        station.setCurrentRadioStation(9);
        station.nextStation();

        int expected = 0;
        int actual = station.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchingRadioStationsPrev() {
        Radio station = new Radio();
        station.setCurrentRadioStation(9);
        station.previousStation();

        int expected = 8;
        int actual = station.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchingRadioStationsPrevMinus1() {
        Radio station = new Radio();
        station.setCurrentRadioStation(0);
        station.previousStation();

        int expected = 9;
        int actual = station.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxVolume10() {
        Radio station = new Radio();
        station.setCurrentVolume(10);

        int expected = 10;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldMinVolume0() {
        Radio station = new Radio();
        station.setCurrentVolume(0);

        int expected = 0;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldAvarageVolume5() {
        Radio station = new Radio();
        station.setCurrentVolume(5);

        int expected = 5;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeBeyond11() {
        Radio station = new Radio();
        station.setCurrentVolume(11);

        int expected = 0;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeBeyondMinus1() {
        Radio station = new Radio();
        station.setCurrentVolume(-1);

        int expected = 0;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeTurnOn10ByNext() {
        Radio station = new Radio();
        station.setCurrentVolume(9);
        station.increaseVolume();

        int expected = 10;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeByNext11() {
        Radio station = new Radio();
        station.setCurrentVolume(10);
        station.increaseVolume();

        int expected = 10;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeByNext1() {
        Radio station = new Radio();
        station.setCurrentVolume(0);
        station.increaseVolume();

        int expected = 1;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeByPrev9() {
        Radio station = new Radio();
        station.setCurrentVolume(10);
        station.decreaseVolume();

        int expected = 9;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeByPrevMinus1() {
        Radio station = new Radio();
        station.setCurrentVolume(0);
        station.decreaseVolume();

        int expected = 0;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }

}