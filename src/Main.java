import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student sAlessandroV = new Student(1, "Alessandro", "Venuti", LocalDate.of(1997, 07, 14));
        Student sMarioR = new Student(2, "Mario", "Rossi", LocalDate.of(1997, 1, 26), Arrays.asList(18, 21, 16, 29));
        Student sGiorgioB = new Student(3, "Giorgio", "Bianchi", LocalDate.of(1999, 5, 17), Arrays.asList(17, 16, 19, 20));
        Student sLuciaF = new Student(4, "Lucia", "Franchi", LocalDate.of(2000, 2, 13));

        Professor pAntonioC = new Professor(1, "Antonio", "Cavallaro", "Arte");
        Professor pMartinaB = new Professor(2, "Martina", "Buotempo");
        pMartinaB.assingGrade(sAlessandroV, 24);
        pAntonioC.assingGrade(sLuciaF, 16);
    }
}
