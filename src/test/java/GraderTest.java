import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {
    @Test
    //saat diberi nilai 59 akan mengembalikan nilai F
    void  limaPuluhSembilanSamaDenganF(){
        var grader = new Grader();
        assertEquals('F', grader.determineLetterGrade(59));
    }
}