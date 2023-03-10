package _7kyuTests;


import _7kyu.KeypadHorror;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KeypadHorrorTest {
    @Test
    void basicTest() {
        assertEquals("0123456789", KeypadHorror.computerToPhone("0789456123"), "For input \"0789456123\"");
        assertEquals("000", KeypadHorror.computerToPhone("000"), "For input \"000\"");
        assertEquals("34567", KeypadHorror.computerToPhone("94561"), "For input \"94561\"");
        assertEquals("", KeypadHorror.computerToPhone(""), "For empty input");
    }

    @Test
    void basicTestForAlter() {
        assertEquals("0123456789", KeypadHorror.computerToPhoneAlter("0789456123"), "For input \"0789456123\"");
        assertEquals("000", KeypadHorror.computerToPhoneAlter("000"), "For input \"000\"");
        assertEquals("34567", KeypadHorror.computerToPhoneAlter("94561"), "For input \"94561\"");
        assertEquals("", KeypadHorror.computerToPhoneAlter(""), "For empty input");
    }

    @Test
    void basicTestForAlterTwo() {
        assertEquals("0123456789", KeypadHorror.computerToPhoneAlterTwo("0789456123"), "For input \"0789456123\"");
        assertEquals("000", KeypadHorror.computerToPhoneAlterTwo("000"), "For input \"000\"");
        assertEquals("34567", KeypadHorror.computerToPhoneAlterTwo("94561"), "For input \"94561\"");
        assertEquals("", KeypadHorror.computerToPhoneAlterTwo(""), "For empty input");
    }

    @Test
    void basicTestForAlterThree() {
        assertEquals("0123456789", KeypadHorror.computerToPhoneAlterThree("0789456123"), "For input \"0789456123\"");
        assertEquals("000", KeypadHorror.computerToPhoneAlterThree("000"), "For input \"000\"");
        assertEquals("34567", KeypadHorror.computerToPhoneAlterThree("94561"), "For input \"94561\"");
        assertEquals("", KeypadHorror.computerToPhoneAlterThree(""), "For empty input");
    }
}
