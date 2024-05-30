package vu.hrm;

public class mainHRM {
    //Main Method
    public static void main(String [] args){
        admin qa = new admin("KIGGUNDU ISA", 23,"Asst QA", "QA and Compliance","kisa@admin.vu.ac.ug");
        System.out.println("Admin Details");
        System.out.println("--------------------------------------------------");
        qa.showDetails();
        
         nonAdmin bouncer = new nonAdmin("Martin Onen Arthur", 30,"Official Body Guard", "350,000","mOnen@.vu.ac.ug");
        System.out.println("Non Admin Details");
        System.out.println("--------------------------------------------------");
        bouncer.showDetails();
    }
}