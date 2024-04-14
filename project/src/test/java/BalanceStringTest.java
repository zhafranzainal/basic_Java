import org.example.BalanceString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BalanceStringTest {

    @Test
    public void testCase1() {

        String row1 = "W?WR?";
        String row2 = "R??W?";
        int expected = 3;

        BalanceString solution = new BalanceString();
        int result = solution.solution(row1, row2);

        assertEquals(expected, result);

    }

    @Test
    public void testCase2() {

        String row1 = "R?R??";
        String row2 = "??W??";
        int expected = 5;

        BalanceString solution = new BalanceString();
        int result = solution.solution(row1, row2);

        assertEquals(expected, result);

    }

    @Test
    public void testCase3() {

        String row1 = "RR?";
        String row2 = "?R?";
        int expected = -1;

        BalanceString solution = new BalanceString();
        int result = solution.solution(row1, row2);

        assertEquals(expected, result);

    }

    @Test
    public void testCase4() {

        String row1 = "WWW??";
        String row2 = "RRR??";
        int expected = -1;

        BalanceString solution = new BalanceString();
        int result = solution.solution(row1, row2);

        assertEquals(expected, result);

    }

    @Test
    public void testCase5() {

        String row1 = "?RW?WR";
        String row2 = "?WR?RW";
        int expected = 0;

        BalanceString solution = new BalanceString();
        int result = solution.solution(row1, row2);

        assertEquals(expected, result);

    }

}
