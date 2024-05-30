

package vu.hrm;


public class Hrm {
//Fields
public String name;
public int age;
public String role;

//Constructor
public Hrm(String name, int age, String role){
this.name = name;
this.age = age;
this.role = role;
}

//method of displaying Hrm details.
public void showDetails(){
    System.out.println(name + " is our Employee aged" + age+ "years old" + " works as" + role);
}

//sub class: admin
class admin extends Hrm{
    String dept;
    String adminID;



public admin(String name, int age, String role, String dept, String adminID){
    super(name,age,role);
    this.dept = dept;
    this.adminID = adminID;
}

@Override
public void showDetails(){
    super.showDetails();
    System.out.println("The admin works in " + dept + " department with an ID of" +adminID);
}
}
        

    class nonAdmin extends Hrm{
        String salary;
        String nonAdminID;
        
        public nonAdmin(String name, int age, String role, String salary, String nonAdminID){
             super(name,age,role);
            this.salary = salary;
            this.nonAdminID = nonAdminID;
        }
        
@Override
public void showDetails(){
    super.showDetails();
    System.out.println("THE NON Admin erans UGX " + salary + " only with an ID of" +nonAdminID);
    }
    }
}
