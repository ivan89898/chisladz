package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/SQR.scv")
    public void testSquareX(int expected, int initialNumber, int finalNumber) {

    }

}