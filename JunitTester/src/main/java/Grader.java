public class Grader {
    //unit test yang lebih rumit
    public  char determineLetterGrade (int numberGrade){
        if (numberGrade < 0){
            throw new IllegalArgumentException("Number grade cannot process");
        }
        else if (numberGrade < 60) {
            return 'E';
        }
        else if (numberGrade < 70) {
            return 'D';
        }
        else if (numberGrade < 80){
            return 'C';
        }
        else if (numberGrade < 90) {
            return 'B';
        }
        else {
            return 'A';
        }
    }
}
