import java.sql.Time;
import java.time.LocalDateTime;

public class Kid {

  String Name;
  int yearOfBirth;
  int age;
  int test = 1;
  int test2 = 2;


  @Override
  public String toString() {
    return "Kid{" +
        "Name='" + Name + '\'' +
        ", yearOfBirth=" + yearOfBirth +
        ", age=" + age +
        ", test=" + test +
        ", test2=" + test2 +
        '}';
  }

  public void calc(){
    age = LocalDateTime.now().getYear() - yearOfBirth;
    //return age;
  }
}

