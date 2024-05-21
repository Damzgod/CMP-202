public class Main {
    public static void main(String[] args) {

        CMP202 cmp202 = new CMP202();
        cmp202.printUserDetails();

      
        Person person = new Person();
        person.setName("David Smith");
        System.out.println(person.getName());
        person.setPass("1234567");

        
        Person student = new Person("Bingham University", "Dami", "7654321", "BHU/22/04/05/0009");
        
        Person staff = new Person("Bingham University", "Abu", "98765", 789);
    }
        Physics physics = new Physics();
        float velocity = physics.calculatevelocity(150.0f, 10);
        
     
    
        
    
}         

    
    


