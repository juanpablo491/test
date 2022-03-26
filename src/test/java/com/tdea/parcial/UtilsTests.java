package com.tdea.parcial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UtilsTests {

    @Test
    public void Invalid_hour_day() {
        int hour = 25;
        Assertions.assertEquals("Invalid hour", Utils.getTimeOfDay(hour));
    }
    @Test
    public void Morning_hour_day() {
        int hour = 10;
        Assertions.assertEquals("Morning", Utils.getTimeOfDay(hour));
    }
    @Test
    public void Night_hour_day() {
        int hour = 4;
        Assertions.assertEquals("Night", Utils.getTimeOfDay(hour));
    }

    @Test
    public void Afternoon_hour_day() {
        int hour = 13;
        Assertions.assertEquals("Afternoon", Utils.getTimeOfDay(hour));
    }
    @Test
    public void Evening_hour_day() {
        int hour = 22;
        Assertions.assertEquals("Evening", Utils.getTimeOfDay(hour));
    }
}


