public class AquaticAnimal extends Animal{

    @Override
    String move(){
        return "swim in water";
    }

    public static void main(String[] args) {
        AquaticAnimal fish = new AquaticAnimal();
        fish.name = "Fishes ";
        System.out.println(fish.name + fish.move());
    }
}