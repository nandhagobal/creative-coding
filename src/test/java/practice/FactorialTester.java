package practice;

import org.junit.jupiter.api.Test;

public class FactorialTester {
    @Test
    void shouldReturnOneIfZeroIsGiven() {
        assert FactoricalFinder.factoricalOf(0)==1;
    }

    @Test
    void shouldReturnOneIfOneIsGiven() {
        assert FactoricalFinder.factoricalOf(1)==1;
    }

    @Test
    void shouldNotReturnZeroIfZeroIsGiven() {
        assert FactoricalFinder.factoricalOf(0)!=0;
    }

    @Test
    void shouldReturnSixIfThreeIsGiven() {
        assert FactoricalFinder.factoricalOf(3)==6;
    }
}
