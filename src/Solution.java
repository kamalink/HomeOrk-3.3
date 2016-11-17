
import java.util.Date;
import java.text.SimpleDateFormat;


/**
 * Created by KamalinkOrigazmi on 14.11.2016.
 */
public class Solution {
    public static void main(String[] args) {

        long val1 = 1476291600000l;
        long val2 = 1476386650000l;
        Date date1 = new Date(val1);
        Date date2 = new Date(val2);


        Course GoJava = new Course(date1, "Phil");
        Course GoQA = new Course(date2, "Xeon");
        Course GoStart = new Course(40,"Markus", "Lora");
        Course GoAndroid = new Course(30, "Bob", "Steven");
        Course GoFrontend = new Course(18, "Zoe", "Sara");

        Course [] coursesTaken = {GoJava, GoQA, GoStart, GoAndroid, GoFrontend};


        Student cSharp = new Student("Felix", "Sharp", 2);
        Student cPlusPlus = new Student("Barbarosa", coursesTaken);


        CollegeStudent PHP = new CollegeStudent("Felix", "Sharp", 2);
        CollegeStudent Swift = new CollegeStudent("Barbarosa", coursesTaken);
        CollegeStudent Delphi = new CollegeStudent("Lola" , 67, 489224452l);

        SpecialStudent fd = new SpecialStudent("Felix", "Sharp", 2);
        SpecialStudent df = new SpecialStudent("Barbarosa", coursesTaken);
        SpecialStudent ddr = new SpecialStudent(389922457l, "jaina18@gmail.com");





    }


}
