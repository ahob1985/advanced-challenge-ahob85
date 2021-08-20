

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class AdvancedChallengeTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class AdvancedChallengeTest
{
    /**
     * Default constructor for test class AdvancedChallengeTest
     */
    public AdvancedChallengeTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
    
    @Test
    public void canBalanceTest() {
        assertEquals(true, AdvancedChallenge.canBalance(new int[] {1, 1, 1, 2, 1}));
        assertEquals(false, AdvancedChallenge.canBalance(new int[] {2, 1, 1, 2, 1}));
        assertEquals(true, AdvancedChallenge.canBalance(new int[] {10, 10}));
        assertEquals(true, AdvancedChallenge.canBalance(new int[] {10, 0, 1, -1, 10}));
        assertEquals(true, AdvancedChallenge.canBalance(new int[] {1, 1, 1, 1, 4}));
        assertEquals(false, AdvancedChallenge.canBalance(new int[] {2, 1, 1, 1, 4}));
        assertEquals(false, AdvancedChallenge.canBalance(new int[] {2, 3, 4, 1, 2}));
        assertEquals(true, AdvancedChallenge.canBalance(new int[] {1, 2, 3, 1, 0, 2, 3}));
        assertEquals(false, AdvancedChallenge.canBalance(new int[] {1, 2, 3, 1, 0, 1, 3}));
        assertEquals(false, AdvancedChallenge.canBalance(new int[] {1}));
        assertEquals(true, AdvancedChallenge.canBalance(new int[] {1, 1, 1, 2, 1}));
    }

    @Test
    public void maxSpanTest() {
        assertEquals(4, AdvancedChallenge.maxSpan(new int[] {1, 2, 1, 1, 3}));
        assertEquals(6, AdvancedChallenge.maxSpan(new int[] {1, 4, 2, 1, 4, 1, 4}));
        assertEquals(6, AdvancedChallenge.maxSpan(new int[] {1, 4, 2, 1, 4, 4, 4}));
        assertEquals(3, AdvancedChallenge.maxSpan(new int[] {3, 3, 3}));
        assertEquals(3, AdvancedChallenge.maxSpan(new int[] {3, 9, 3}));
        assertEquals(2, AdvancedChallenge.maxSpan(new int[] {3, 9, 9}));
        assertEquals(1, AdvancedChallenge.maxSpan(new int[] {3, 9}));
        assertEquals(2, AdvancedChallenge.maxSpan(new int[] {3, 3}));
        assertEquals(0, AdvancedChallenge.maxSpan(new int[] {}));
        assertEquals(1, AdvancedChallenge.maxSpan(new int[] {1}));
    }

    @Test
    public void linearInTest() {
        assertEquals(true, AdvancedChallenge.linearIn(new int[] {1, 2, 4, 6}, new int[] {2, 4}));
        assertEquals(false, AdvancedChallenge.linearIn(new int[] {1, 2, 4, 6}, new int[] {2, 3, 4}));
        assertEquals(true, AdvancedChallenge.linearIn(new int[] {1, 2, 4, 4, 6}, new int[] {2, 4}));
        assertEquals(true, AdvancedChallenge.linearIn(new int[] {2, 2, 4, 4, 6, 6}, new int[] {2, 4}));
        assertEquals(true, AdvancedChallenge.linearIn(new int[] {2, 2, 2, 2, 2}, new int[] {2, 2}));
        assertEquals(false, AdvancedChallenge.linearIn(new int[] {2, 2, 2, 2, 2}, new int[] {2, 4}));
        assertEquals(true, AdvancedChallenge.linearIn(new int[] {2, 2, 2, 2, 4}, new int[] {2, 4}));
        assertEquals(true, AdvancedChallenge.linearIn(new int[] {1, 2, 3}, new int[] {2}));
        assertEquals(false, AdvancedChallenge.linearIn(new int[] {1, 2, 3}, new int[] {-1}));
        assertEquals(true, AdvancedChallenge.linearIn(new int[] {1, 2, 3}, new int[] {}));
        assertEquals(true, AdvancedChallenge.linearIn(new int[] {-1, 0, 3, 3, 3, 10, 12}, new int[] {-1, 0, 3, 12}));
        assertEquals(false, AdvancedChallenge.linearIn(new int[] {-1, 0, 3, 3, 3, 10, 12}, new int[] {0, 3, 12, 14}));
        assertEquals(false, AdvancedChallenge.linearIn(new int[] {-1, 0, 3, 3, 3, 10, 12}, new int[] {-1, 10, 11}));
    }

    @Test
    public void fix45Test() {
        assertArrayEquals(new int[] {9,4,5,4,5,9}, AdvancedChallenge.fix45(new int[] {5, 4, 9, 4, 9, 5}));
        assertArrayEquals(new int[] {1,4,5,1}, AdvancedChallenge.fix45(new int[] {1, 4, 1, 5}));
        assertArrayEquals(new int[] {1,4,5,1,1,4,5}, AdvancedChallenge.fix45(new int[] {1, 4, 1, 5, 5, 4, 1}));
        assertArrayEquals(new int[] {4,5,4,5,9,9,4,5,9}, AdvancedChallenge.fix45(new int[] {4, 9, 4, 9, 5, 5, 4, 9, 5}));
        assertArrayEquals(new int[] {1,1,4,5,4,5}, AdvancedChallenge.fix45(new int[] {5, 5, 4, 1, 4, 1}));
        assertArrayEquals(new int[] {4,5,2,2}, AdvancedChallenge.fix45(new int[] {4, 2, 2, 5}));
        assertArrayEquals(new int[] {4,5,4,5,2,2}, AdvancedChallenge.fix45(new int[] {4, 2, 4, 2, 5, 5}));
        assertArrayEquals(new int[] {4,5,4,5,2}, AdvancedChallenge.fix45(new int[] {4, 2, 4, 5, 5}));
        assertArrayEquals(new int[] {1,1,1}, AdvancedChallenge.fix45(new int[] {1, 1, 1}));
        assertArrayEquals(new int[] {4,5}, AdvancedChallenge.fix45(new int[] {4, 5}));
        assertArrayEquals(new int[] {1,4,5}, AdvancedChallenge.fix45(new int[] {5, 4, 1}));
        assertArrayEquals(new int[] {}, AdvancedChallenge.fix45(new int[] {}));
        assertArrayEquals(new int[] {1,4,5,4,5}, AdvancedChallenge.fix45(new int[] {5, 4, 5, 4, 1}));
        assertArrayEquals(new int[] {4,5,4,5,1}, AdvancedChallenge.fix45(new int[] {4, 5, 4, 1, 5}));
        assertArrayEquals(new int[] {3,4,5}, AdvancedChallenge.fix45(new int[] {3, 4, 5}));
        assertArrayEquals(new int[] {4,5,1}, AdvancedChallenge.fix45(new int[] {4, 1, 5}));
        assertArrayEquals(new int[] {1,4,5}, AdvancedChallenge.fix45(new int[] {5, 4, 1}));
        assertArrayEquals(new int[] {2,4,5,2}, AdvancedChallenge.fix45(new int[] {2, 4, 2, 5}));
    }

    @Test
    public void squareUpTest() {
        assertArrayEquals(new int[] {0,0,1,0,2,1,3,2,1}, AdvancedChallenge.squareUp(3));
        assertArrayEquals(new int[] {0,1,2,1}, AdvancedChallenge.squareUp(2));
        assertArrayEquals(new int[] {0,0,0,1,0,0,2,1,0,3,2,1,4,3,2,1}, AdvancedChallenge.squareUp(4));
        assertArrayEquals(new int[] {1}, AdvancedChallenge.squareUp(1));
        assertArrayEquals(new int[] {}, AdvancedChallenge.squareUp(0));
    }
}
