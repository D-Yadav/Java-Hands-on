package com.hcl.day3;

public class Student {
    int sno;
    String name;
    double cgp;
    
    @Override
    public String toString() {
        return "Student [sno=" + sno + ", name=" + name + ", cgp=" + cgp + "]";
    }








    public void showdetails() {
        Student s1=new Student();
        s1.sno=1;
        s1.name="sneha";
        s1.cgp=5.4;
        Student s2=new Student();
        s2.sno=2;
        s2.name="shona";
        s2.cgp=7.5;
        Student s3=new Student();
        s3.sno=3;
        s3.name="teja";
        s3.cgp=9.4;
       Student[] arr={s1,s2,s3};
       for (Student student : arr) {
           System.out.println(student);
        
    }
        }
       
            
            
       
        
        
   

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
new Student().showdetails();
    }

}
