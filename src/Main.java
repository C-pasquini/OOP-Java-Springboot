import models.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
            Student totoro = new Student("Davide");
            System.out.println(totoro.getAverageGrade());
            totoro.addGrade(5);
            System.out.println(totoro.getAverageGrade());
            totoro.addGrade(30);
            System.out.println(totoro.getAverageGrade());
            totoro.addGrade(18);
            System.out.println(totoro.getAverageGrade());
    }
}
