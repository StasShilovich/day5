package test.shilovich.day5.service.impl;

import com.shilovich.day5.service.TextDeletion;
import com.shilovich.day5.service.impl.TextDeletionByRegexImpl;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class TextDeletionByRegexImplTest {
    TextDeletion deletion;
    String text;

    @BeforeClass
    public void setUp() {
        deletion = new TextDeletionByRegexImpl();
        text = "Через несокрушимый, высеченный из камня лабиринт течет Нева.";
    }

    @Test
    public void testAllNonLetterCharactersDeletionPositive() {
        String actual = deletion.deleteAllNonLetterCharacters(text);
        String expected = "Через несокрушимый высеченный из камня лабиринт течет Нева";
        assertEquals(actual, expected);
    }

    @Test
    public void testAllNonLetterCharactersDeletionNegative() {
        String actual = deletion.deleteAllNonLetterCharacters(text);
        String expected = "Через несокрушимый высеченный из камня лабиринт течет Нева.";
        assertNotEquals(actual, expected);
    }

    @Test
    public void testSpecificWordsDeletionPositive() {
        String actual = deletion.deleteSpecificWords(text, 5);
        String expected = " несокрушимый, высеченный из  лабиринт  Нева.";
        assertEquals(actual, expected);
    }

    @Test
    public void testSpecificWordsDeletionNegative() {
        String actual = deletion.deleteSpecificWords(text, 5);
        String expected = "Через несокрушимый, высеченный из  лабиринт  Нева.";
        assertNotEquals(actual, expected);
    }
}