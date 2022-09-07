package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    Radio station = new Radio(10);

    @Test
    public void shouldSetNumberOfRadioStations() {
        Radio station = new Radio();
        station.setNumberOfRadioStations(10);

        int expected = 10;
        int actual = station.getNumberOfRadioStations();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberOfRadioStationsUnderAmount() {
        Radio station = new Radio();
        station.setNumberOfRadioStations(-1);

        int expected = 10;
        int actual = station.getNumberOfRadioStations();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldRadioStationTurnOn9() {
        Radio station = new Radio();
        station.setCurrentRadioStation(9);

        int expected = 9;
        int actual = station.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldRadioStationTurnOn0() {
        Radio station = new Radio();
        station.setCurrentRadioStation(0);

        int expected = 0;
        int actual = station.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldRadioStationTurnOn8() {
        Radio station = new Radio();
        station.setCurrentRadioStation(8);

        int expected = 8;
        int actual = station.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldRadioStationTurnOn1() {
        Radio station = new Radio();
        station.setCurrentRadioStation(1);

        int expected = 1;
        int actual = station.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldRadioStationTurnOnLessStation() {
        Radio station = new Radio();
        station.setCurrentRadioStation(-1);

        int expected = 9;
        int actual = station.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldRadioStationTurnOn10() {
        Radio station = new Radio();
        station.setCurrentRadioStation(10);

        int expected = 0;
        int actual = station.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldRadioStationTurnOnNext() {
        Radio station = new Radio();
        station.setCurrentRadioStation(8);
        station.increaseRadioStation();

        int expected = 9;
        int actual = station.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldRadioStationTurnOn10ByNext() {
        Radio station = new Radio();
        station.setCurrentRadioStation(9);
        station.increaseRadioStation();

        int expected = 0;
        int actual = station.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldRadioStationFrom9To8ByPrev() {
        Radio station = new Radio();
        station.setCurrentRadioStation(9);
        station.decreaseRadioStation();

        int expected = 8;
        int actual = station.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldRadioStationTurnOn0To1ByNext() {
        Radio station = new Radio();
        station.setCurrentRadioStation(0);
        station.increaseRadioStation();

        int expected = 1;
        int actual = station.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldRadioStationFrom0ByPrev() {
        Radio station = new Radio();
        station.setCurrentRadioStation(0);
        station.decreaseRadioStation();

        int expected = 9;
        int actual = station.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeTurnOn100() {
        Radio station = new Radio();
        station.setCurrentVolume(100);

        int expected = 100;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeTurnOn0() {
        Radio station = new Radio();
        station.setCurrentVolume(0);

        int expected = 0;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeTurnOn99() {
        Radio station = new Radio();
        station.setCurrentVolume(99);

        int expected = 99;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeTurnOn1() {
        Radio station = new Radio();
        station.setCurrentVolume(1);

        int expected = 1;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeTurnOn101() {
        Radio station = new Radio();
        station.setCurrentVolume(101);

        int expected = 0;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeTurnOn00() {
        Radio station = new Radio();
        station.setCurrentVolume(0);

        int expected = 0;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeTurnOn100ByNext() {
        Radio station = new Radio();
        station.setCurrentVolume(99);
        station.increaseVolume();

        int expected = 100;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeTurnOn101ByNext() {
        Radio station = new Radio();
        station.setCurrentVolume(101);
        station.increaseVolume();

        int expected = 1;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeTurnOn1ByNext() {
        Radio station = new Radio();
        station.setCurrentVolume(0);
        station.increaseVolume();

        int expected = 1;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeTurnOn99ByPrev() {
        Radio station = new Radio();
        station.setCurrentVolume(100);
        station.decreaseVolume();

        int expected = 99;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeTurnOn0ByPrev() {
        Radio station = new Radio();
        station.setCurrentVolume(1);
        station.decreaseVolume();

        int expected = 0;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeFrom0ByPrev() {
        Radio station = new Radio();
        station.setCurrentVolume(0);
        station.decreaseVolume();

        int expected = 0;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeUnderMin() {
        Radio station = new Radio();
        station.setCurrentVolume(-1);
        station.decreaseVolume();

        int expected = 0;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }
}