package practice;

import org.junit.jupiter.api.Test;

public class FactorialTester {
    @Test
    void shouldReturnFactoricalAsOneIfNumberIsGivenAsZero() {
        assert FactoricalFinder.factoricalOf(0)==1;
    }
    @Test
    void shouldReturnFactoricalAsZeroIfNumberIsGivenAsNegative(){
        assert FactoricalFinder.factoricalOf(-1)==0;
    }
    @Test
    void shouldReturnFactoricalAsOneIfNumberIsGivenAsOne() {
        assert FactoricalFinder.factoricalOf(1)==1;
    }

    @Test
    void shouldNotReturnFactorialAsZeroIfNumberIsGivenAsZero() {
        assert FactoricalFinder.factoricalOf(0)!=0;
    }

    @Test
    void shouldReturnFactorialAsSixIfNumberIsGivenAsThree() {
        assert FactoricalFinder.factoricalOf(3)==6;
    }
}
