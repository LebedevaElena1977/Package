package ru.netology.sqr.Package.services;

class SQRServiceTest {
    @Test
    public void testCalcWhenSomeSquaresFound() {
        SQRServise servise = new SQRServise();

        int actual = servise.calc(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);

    }


}