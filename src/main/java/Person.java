package src.main.java;

import java.time.LocalDate;
import java.time.Period;

public class Person {

    public enum Sex {
        MALE, FEMALE
    }

    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;

    public Person(){
        this("name", null, null, null);
    }
    public Person(String name, LocalDate birthday, Sex gender, String emailAddress){
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.emailAddress = emailAddress;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
    public int getAge() {
       if(birthday == null){
           return -1;
       }
       LocalDate currentDate = LocalDate.now();
       return Period.between(birthday, currentDate).getYears();
    }

    public void printPerson() {
        // ...
    }

}
