public class Person {
    private String schoolName = "Bingham University";
    private String name;
    private String password;
    private String matricNo;
    private int staffNo; // Assuming staff number is an integer
    
  
    Person() {
        System.out.println("Object Created");
    }
    
   
    public Person(String schoolName, String name, String password, String matricNo) {
        this.schoolName = schoolName;
        this.name = name;
        this.password = password;
        this.matricNo = matricNo;
    }

    public Person(String schoolName, String name, String password, int staffNo) {
        this.schoolName = schoolName;
        this.name = name;
        this.password = password;
        this.staffNo = staffNo;
    }

    String getName() {
        return name;
    }


    void setName(String name) {
        this.name = name;
    }

  
    void setPass(String password) {
        this.password = password;
    }
}
