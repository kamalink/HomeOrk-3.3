import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.text.CollationElementIterator;
import java.util.Date;

/**
 * Created by KamalinkOrigazmi on 14.11.2016.
 */
public class Solution {
    public static void main(String[] args) {
        Date startDate = new Date();
       Course firstObject = new Course(15,"Markus", "Lora");
        Course secondObject = new Course(30, "Bob", "Steven");
        Course thirdObject = new Course(18, "Zoe", "Sara");
        Course fourthObject = new Course(startDate, "ar");
        Course fifthObject = new Course(startDate, "ra");

        Student sixthObject = new Student("Felix", "Sharp", 2);


        CollegeStudent eightObject = new CollegeStudent();
        CollegeStudent ninethObject = new CollegeStudent();

        System.out.println(firstObject);
        System.out.println(secondObject);
        System.out.println(thirdObject);
        System.out.println(fourthObject);
        System.out.println(fifthObject);
        System.out.println(sixthObject);




    }


}
