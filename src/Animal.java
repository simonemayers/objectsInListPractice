import java.util.ArrayList;
import java.util.Scanner;

public class Animal {

    private String name;
    private boolean isDog;

    public Animal(){}

    public Animal(boolean isDog){
        this.isDog = isDog;
    }
    public Animal(String name){
        this.name = name;
    }
    public Animal(String name, boolean isDog) {
        this.name = name;
        this.isDog = isDog;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDog() {
        return isDog;
    }

    public void setDog(boolean isDog) {
        this.isDog = isDog;
    }
    public boolean getIsDog(){
        return this.isDog;
    }

    public String toString() {
        return "Animal [isDog=" + isDog() + ", name=" + getName() + "]";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> animals = new ArrayList<Animal>();

        for (int i = 0; i < animals.size() + 1; i++) {

            System.out.println("Animal Menu");
            System.out.println("Please enter a name: ");
            String inputAnimal = scanner.nextLine();
            System.out.println("Is it a dog? true or false");
            Boolean inputIsDog = scanner.nextBoolean();
            animals.add(new Animal(inputAnimal, inputIsDog));

            System.out.println("Would you like to add another animal? yes or no");
            String fixABug = scanner.nextLine();
            String keepGoing = scanner.nextLine();

            if (keepGoing.equals("no")) {
                for (Animal Animal : animals) {
                    System.out.println(Animal.toString());
                }
                break;
            }
        }
    }

}