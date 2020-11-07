import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void addTest() {
        assertEquals( 2, calculator.add( 1, 1 ) );

    }

    //
    @Test
    void multiplyTest() {
        assertEquals( 6, calculator.multiply( 2, 3 ) );
    }

    @Test
    void addDoubleTest() {
        assertEquals( 2.5, calculator.add( 1.3, 1.2 ) );

    }

    @Test
    void multiplyDoubleTest() {
        assertEquals( 5, calculator.multiply( 2.5, 2 ) );
    }

    @Test
    void superieurA() {
        assertEquals( "Superieur", calculator.superieurA( 4, 3 ) );
    }

}
