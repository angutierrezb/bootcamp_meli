//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Cow cow = new Cow();

        cat.emitSound();
        dog.emitSound();
        cow.emitSound();

        animalEat(cat);
        animalEat(dog);
        animalEat(cow);

    }

    public static void animalEat(Animal animal) {
        if (animal instanceof Carnivorous) {
            ((Carnivorous) animal).eatMeat();
        } else if (animal instanceof Herbivorous) {
            ((Herbivorous) animal).eatGrass();
        }
    }
}