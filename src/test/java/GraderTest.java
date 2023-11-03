import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {
    @Test
    //saat diberi nilai 59 akan mengembalikan nilai E
    void  limaPuluhSembilanSamaDenganE(){
        var grader = new Grader();
        assertEquals('E', grader.determineLetterGrade(59));
    }

    @Test
        //saat diberi nilai 69 akan mengembalikan nilai D
    void  enamPuluhSembilanSamaDenganD(){
        var grader = new Grader();
        assertEquals('D', grader.determineLetterGrade(69));
    }

    @Test
        //saat diberi nilai 79 akan mengembalikan nilai C
    void  TujuhPuluhSembilanSamaDenganC(){
        var grader = new Grader();
        assertEquals('C', grader.determineLetterGrade(79));
    }


    @Test
        //saat diberi nilai 89 akan mengembalikan nilai B
    void  delapanPuluhSembilanSamaDenganB(){
        var grader = new Grader();
        assertEquals('B', grader.determineLetterGrade(89));
    }

    @Test
        //saat diberi nilai 100 akan mengembalikan nilai A
    void  sembilanPuluhSembilanSamaDenganA(){
        var grader = new Grader();
        assertEquals('A', grader.determineLetterGrade(99));
    }

    @Test
        //test yang disengaja untuk salah
    void  sembilanPuluhSembilanSamaDenganC(){
        var grader = new Grader();
        assertEquals('C', grader.determineLetterGrade(99));
    }
}
