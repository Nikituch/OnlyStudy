
package laba_3;

public class Man {
    private String name;
    private String sex;
    private int age;
    private double load;
    
    public void overideName(String name){
        this.name = name;
         System.out.println("Name : " + this.name);
    } 
    
        public int overideAge(int age){
        this.age = age;
         //System.out.println("Age : " + this.age + " y.old");
         return this.age;
    } 
        
        public void overideLoad(int age){
            this.load = load;
            if(age<=15)
                load = age*3.1; 
            if(age>=16 && age<25)
                load = 80;
            if(age>=25 && age<55)
                load = 85.6;
            
   
            System.out.println("Load : " + this.load + " kg");
    } 
    
}
