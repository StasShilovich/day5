package test.shilovich.day5.service.impl;

import com.shilovich.day5.service.TextReplacement;
import com.shilovich.day5.service.impl.TextReplacementByRegexImpl;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class TextReplacementByRegexImplTest {
    TextReplacement replacement;
    String text;

    @BeforeClass
    public void setUp() {
        replacement = new TextReplacementByRegexImpl();
        text = "Через несокрушимый, высеченный из камня лабиринт течет Нева.";
    }

    @Test
    public void testReplaceGivenLetterPositive() {
        String actual = replacement.replaceGivenLetter(text, 5, 'X');
        String expected = "ЧереX несоXрушимый, высеXенный из камнX лабиXинт течеX Нева.";
        assertEquals(actual, expected);
    }

    @Test
    public void testReplaceGivenLetterNegative() {
        String actual = replacement.replaceGivenLetter(text, 5, 'X');
        String expected = "ЧереX несоXрушимый, высеXенный из камнX лабиXинт течет Нева.";
        assertNotEquals(actual, expected);
    }

    @Test
    public void testReplaceLetterCombinationPositive() {
        String actual = replacement.replaceLetterCombination(text, 'н', 'е', 'ё');
        String expected = "Через нёсокрушимый, высеченный из камня лабиринт течет Нева.";
        assertEquals(actual, expected);
    }

    @Test
    public void testReplaceLetterCombinationNegative() {
        String actual = replacement.replaceLetterCombination(text, 'н', 'е', 'ё');
        String expected = "Через несокрушимый, высеченный из камня лабиринт течет Нева.";
        assertNotEquals(actual, expected);
    }


    @Test
    public void testReplaceWordsBySubstringPositive() {
        String actual = replacement.replaceWordsBySubstring(text, 5, "lul");
        String expected = "lul несокрушимый, высеченный из lul лабиринт lul Нева.";
        assertEquals(actual, expected);
    }

    @Test
    public void testReplaceWordsBySubstringNegative() {
        String actual = replacement.replaceWordsBySubstring(text, 5, "lul");
        String expected = "Через несокрушимый, высеченный из lul лабиринт lul Нева.";
        assertNotEquals(actual, expected);
    }
}