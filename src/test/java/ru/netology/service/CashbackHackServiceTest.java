package ru.netology.service;

import org.junit.Test;
import org.junit.Assert;

public class CashbackHackServiceTest {
        @Test
        public void CashbackHackerLessThenMax() {
            CashbackHackService Check = new CashbackHackService();
            int actual = Check.remain(999);
            int expected = 1;
            Assert.assertEquals(expected, actual);
        }

    @Test
    public void CashbackHackerMoreThenMax() {
        CashbackHackService Check = new CashbackHackService();
        int actual = Check.remain(1001);
        int expected = 999;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void CashbackHackerBoundary() {
        CashbackHackService Check = new CashbackHackService();
        int actual = Check.remain(1000);
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }

}
