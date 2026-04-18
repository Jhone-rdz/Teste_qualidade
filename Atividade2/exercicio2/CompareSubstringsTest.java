package Atividade2.exercicio2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompareSubstringsTest {

    @Test
    void shouldReturnSmallestAndLargestSubstringForKnownExample() {
        CompareSubstrings compare = new CompareSubstrings();

        assertEquals("ava\nwel", compare.getSmallestAndLargest("welcometojava", 3));
    }

    @Test
    void shouldReturnSameSubstringWhenAllCandidatesAreEqual() {
        CompareSubstrings compare = new CompareSubstrings();

        assertEquals("aa\naa", compare.getSmallestAndLargest("aaaa", 2));
    }

    @Test
    void shouldReturnInputWhenKEqualsStringLength() {
        CompareSubstrings compare = new CompareSubstrings();

        assertEquals("casa\ncasa", compare.getSmallestAndLargest("casa", 4));
    }
}
