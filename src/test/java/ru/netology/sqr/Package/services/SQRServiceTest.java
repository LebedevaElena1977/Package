package ru.netology.sqr.Package.services;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    public void TestCalcWhenSomeSquaresFound() {

        SQRServise servise = new SQRServise();
        int actual = servise.calc(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

}

