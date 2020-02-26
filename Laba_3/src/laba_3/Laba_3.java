
package laba_3;


public class Laba_3 {

    public static void main(String[] args) {
       Student student = new Student();
       
       System.out.println("Age : " + student.overideAge(16) + " y.old");
       student.overideLoad(student.overideAge(16));
       student.overideName("Jora");
       
       System.out.println("This year : " + student.overideYear(2020));
       student.newYear(student.overideYear(2020), 12);
       
    }
    
}
