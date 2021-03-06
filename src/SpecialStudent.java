/**
 * Created by KamalinkOrigazmi on 14.11.2016.
 */
public class SpecialStudent extends CollegeStudent {
    private long secretKey;
    private String email;

    public SpecialStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    public SpecialStudent(String lastName, Course[] coursesTaken){
        super(lastName, coursesTaken);
    }

    public SpecialStudent(long secretKey, String email){
        this.secretKey = secretKey;
        this.email = email;
    }





    public long getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(long secretKey) {
        this.secretKey = secretKey;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}



