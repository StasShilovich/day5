package test.shilovich.day5.service.impl;

import com.shilovich.day5.service.TextReplacement;
import com.shilovich.day5.service.impl.TextReplacementByCharacterImpl;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class TextReplacementByCharacterImplTest {
    TextReplacement replacement;
    String text;

    @BeforeClass
    public void setUp() {
        replacement = new TextReplacementByCharacterImpl();
        text = "Через несокрушимый, высеченный из камня лабиринт течет Нева.";
    }

    @Test
    public void testGivenLetterReplacePositive() {
        String actual = replacement.replaceGivenLetter(text, 5, '$');
        String expected = "Чере$ несо$рушимый, высе$енный из камн$ лаби$инт тече$ Нева.";
        assertEquals(actual, expected);
    }

    @Test
    public void testGivenLetterReplaceNegative() {
        String actual = replacement.replaceGivenLetter(text, 5, '$');
        String expected = "Чере$ несорушимый, высе$енный из камн$ лаби$инт тече$ Нева";
        assertNotEquals(actual, expected);
    }

    @Test
    public void testLetterCombinationReplacementPositive() {
        String actual = replacement.replaceLetterCombination(text, 'н', 'е', 'ё');
        String expected = "Через нёсокрушимый, высеченный из камня лабиринт течет Нёва.";
        assertEquals(actual, expected);
    }

    @Test
    public void testLetterCombinationReplacementNegative() {
        String actual = replacement.replaceLetterCombination(text, 'н', 'е', 'ё');
        String expected = "Через нёсокрушимый, высеченный из камня лабиринт течет Нева";
        assertNotEquals(actual, expected);
    }

    @Test
    public void testReplacementWordsBySubstringPositive() {
        String actual = replacement.replaceWordsBySubstring(text, 5, "lul");
        String expected = "lul несокрушимый, высеченный из lul лабиринт lul Нева.";
        assertEquals(actual, expected);
    }

    @Test
    public void testReplacementWordsBySubstringNegative() {
        String actual = replacement.replaceWordsBySubstring(text, 5, "lul");
        String expected = "lul несокрушимый, высеченный из lul лабиринт lul Нева";
        assertNotEquals(actual, expected);
    }
}