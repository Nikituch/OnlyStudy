
package laba_3;


public class Student extends Man{
    private int year;
    
    public int overideYear(int year){
        this.year = year;
         //System.out.println("This year :" + this.year);
         return this.year;
    } 
    
        public void newYear(int year, int i){
        this.year = year + i;
        System.out.println("New year : " + this.year);
    } 
    
}
