package ru.netology.service;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    // купил на 999 ответ 1
    @Test
    public void test1 () {

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(999);
        int expected = 1;

        assertEquals(actual, expected);
    }

    // купил на 1000 ответ 0
    @Test
    public void shouldNotAskToIncreaseTheAmountIfDivisibleByBoundary  () {

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(actual, expected);
    }

    // купил на 1001 ответ 999
    @Test
    public void test3 () {

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1001);
        int expected = 999;

        assertEquals(actual, expected);
    }

    //середина диапазона
    @Test
    public void test4 () {

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1500);
        int expected = 500;

        assertEquals(actual, expected);
    }
}
