import static org.junit.Assert.assertEquals;

//github test
import org.junit.Test;

import components.sequence.Sequence;
import components.sequence.Sequence1L;

/**
 * Sample JUnit test fixture for SequenceSmooth.
 *
 * @author Put your name here
 *
 */
public final class SequenceSmoothTest {

    /**
     * Constructs and returns a sequence of the integers provided as arguments.
     *
     * @param args
     *            0 or more integer arguments
     * @return the sequence of the given arguments
     * @ensures createFromArgs= [the sequence of integers in args]
     */
    private Sequence<Integer> createFromArgs(Integer... args) {
        Sequence<Integer> s = new Sequence1L<Integer>();
        for (Integer x : args) {
            s.add(s.length(), x);
        }
        return s;
    }

    /**
     * Test smooth with s1 = <2, 4, 6> and s2 = <-5, 12>.
     */
    @Test
    public void test1() {
        /*
         * Set up variables and call method under test
         */
        Sequence<Integer> seq1 = this.createFromArgs(2, 4, 6);
        Sequence<Integer> expectedSeq1 = this.createFromArgs(2, 4, 6);
        Sequence<Integer> seq2 = this.createFromArgs(-5, 12);
        Sequence<Integer> expectedSeq2 = this.createFromArgs(3, 5);
        SequenceSmooth.smooth(seq1, seq2);
        /*
         * Assert that values of variables match expectations
         */
        assertEquals(expectedSeq1, seq1);
        assertEquals(expectedSeq2, seq2);
    }

    /**
     * Test smooth with s1 = <7> and s2 = <13, 17, 11>.
     */
    @Test
    public void test2() {
        /*
         * Set up variables and call method under test
         */
        Sequence<Integer> seq1 = this.createFromArgs(7);
        Sequence<Integer> expectedSeq1 = this.createFromArgs(7);
        Sequence<Integer> seq2 = this.createFromArgs(13, 17, 11);
        Sequence<Integer> expectedSeq2 = this.createFromArgs();
        SequenceSmooth.smooth(seq1, seq2);
        /*
         * Assert that values of variables match expectations
         */
        assertEquals(expectedSeq1, seq1);
        assertEquals(expectedSeq2, seq2);
    }

    /**
     * Test smooth with s1 = <7, 23, 2, 6> and s2 = <1, 2, 3>.
     */
    @Test
    public void test3() {
        /*
         * Set up variables and call method under test
         */
        Sequence<Integer> seq1 = this.createFromArgs(7, 23, 2, 6);
        Sequence<Integer> expectedSeq1 = this.createFromArgs(7, 23, 2, 6);
        Sequence<Integer> seq2 = this.createFromArgs(1, 2, 3);
        Sequence<Integer> expectedSeq2 = this.createFromArgs(15, 12, 4);
        SequenceSmooth.smooth(seq1, seq2);
        /*
         * Assert that values of variables match expectations
         */
        assertEquals(expectedSeq1, seq1);
        assertEquals(expectedSeq2, seq2);
    }

    /**
     * Test smooth with s1 = <15, 25, 4, 6> and s2 = <19, 6, 48>.
     */
    @Test
    public void test4() {
        /*
         * Set up variables and call method under test
         */
        Sequence<Integer> seq1 = this.createFromArgs(15, 25, 4, 6);
        Sequence<Integer> expectedSeq1 = this.createFromArgs(15, 25, 4, 6);
        Sequence<Integer> seq2 = this.createFromArgs(19, 6, 48);
        Sequence<Integer> expectedSeq2 = this.createFromArgs(20, 14, 5);
        SequenceSmooth.smooth(seq1, seq2);
        /*
         * Assert that values of variables match expectations
         */
        assertEquals(expectedSeq1, seq1);
        assertEquals(expectedSeq2, seq2);
    }

    /**
     * Test smooth with s1 = <68, 2, 45, 7, 105> and s2 = <10>.
     */
    @Test
    public void test5() {
        /*
         * Set up variables and call method under test
         */
        Sequence<Integer> seq1 = this.createFromArgs(68, 2, 45, 7, 105);
        Sequence<Integer> expectedSeq1 = this.createFromArgs(68, 2, 45, 7, 105);
        Sequence<Integer> seq2 = this.createFromArgs(10);
        Sequence<Integer> expectedSeq2 = this.createFromArgs(35, 23, 26, 56);
        SequenceSmooth.smooth(seq1, seq2);
        /*
         * Assert that values of variables match expectations
         */
        assertEquals(expectedSeq1, seq1);
        assertEquals(expectedSeq2, seq2);
    }

    /**
     * Test smooth with s1 = <14, 186, 275, 6, 73, 43, 111> and s2 = <95>.
     */
    @Test
    public void test6() {
        /*
         * Set up variables and call method under test
         */
        Sequence<Integer> seq1 = this.createFromArgs(14, 186, 275, 6, 73, 43,
                111);
        Sequence<Integer> expectedSeq1 = this.createFromArgs(14, 186, 275, 6,
                73, 43, 111);
        Sequence<Integer> seq2 = this.createFromArgs(95);
        Sequence<Integer> expectedSeq2 = this.createFromArgs(100, 230, 140, 39,
                58, 77);
        SequenceSmooth.smooth(seq1, seq2);
        /*
         * Assert that values of variables match expectations
         */
        assertEquals(expectedSeq1, seq1);
        assertEquals(expectedSeq2, seq2);
    }

}
