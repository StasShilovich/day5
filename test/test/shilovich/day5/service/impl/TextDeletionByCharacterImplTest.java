package test.shilovich.day5.service.impl;

import com.shilovich.day5.service.TextDeletion;
import com.shilovich.day5.service.impl.TextDeletionByCharacterImpl;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class TextDeletionByCharacterImplTest {
    TextDeletion deletion;
    String text;

    @BeforeClass
    public void setUp() {
        deletion = new TextDeletionByCharacterImpl();
        text = "Через несокрушимый, высеченный из камня лабиринт течет Нева.";
    }

    @Test
    public void testDeletionNonLetterCharacterPositive() {
        String actual = deletion.deleteAllNonLetterCharacters(text);
        String expected = "Через несокрушимый высеченный из камня лабиринт течет Нева";
        assertEquals(actual, expected);
    }

    @Test
    public void testDeletionNonLetterCharacterNegative() {
        String actual = deletion.deleteAllNonLetterCharacters(text);
        String expected = "Через несокрушимый высеченный из камня лабиринт течет Нева.";
        assertNotEquals(actual, expected);
    }

    @Test
    public void testDeletionSpecificWordsPositive() {
        String actual = deletion.deleteSpecificWords(text, 5);
        String expected = "несокрушимый, высеченный из лабиринт Нева.";
        assertEquals(actual, expected);
    }

    @Test
    public void testDeletionSpecificWordsNegative() {
        String actual = deletion.deleteSpecificWords(text, 5);
        String expected = "Через несокрушимый, высеченный из лабиринт Нева.";
        assertNotEquals(actual, expected);
    }
}
