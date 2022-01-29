package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class WordDictionaryTest {

    @Test
    void search() {
        WordDictionary211 wordDictionary = new WordDictionary211();
        wordDictionary.addWord("bad");
        wordDictionary.addWord("dad");
        wordDictionary.addWord("mad");
        assertFalse(wordDictionary.search("pad"));// return False
        assertTrue(wordDictionary.search("bad")); // return True
        assertTrue(wordDictionary.search(".ad")); // return True
        assertTrue(wordDictionary.search("b..")); // return True
    }
}