import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void twoPlusTwoShouldEqualFour(){
        //variabel untuk melakukan pemanggilan
        var calculator = new SimpleCalculator();
        //untuk memanggil variabel SimpleCalculator
        //assertEquals = menentukan nilai yang seharusnya jika diberi nilai tersebut
        assertEquals(4,calculator.add(2,2));
    }

    @Test
    void threePlusSevenShouldEqualTen(){
        var calculator = new SimpleCalculator();
        assertEquals(10, calculator.add(3,7));
    }
}