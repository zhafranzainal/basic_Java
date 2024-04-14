import org.example.BalanceString;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BalanceStringTest {

    @ParameterizedTest
    @CsvSource({
            "'W?WR?', 'R??W?', 3",
            "'R?R??', '??W??', 5",
            "'RR?', '?R?', -1",
            "'WWW??', 'RRR??', -1",
            "'?RW?WR', '?WR?RW', 0'"
    })

    public void testCases(String row1, String row2, int expected) {

        BalanceString solution = new BalanceString();
        int result = solution.solution(row1, row2);

        assertEquals(expected, result);

    }

}
