/*
Se solicita la creación de una clase abstracta denominada Animal, de la cual deriven 3 animales: Perro, Gato y Vaca.
Los 3 animales son capaces de “emitir sonidos”, para ello será necesario implementar un método que permita mostrar
por pantalla el sonido que emite cada animal. Por ejemplo, en el caso del perro “guau”, el gato “miau” y la vaca “muuu”.

A partir de esto, teniendo en cuenta los gustos alimenticios de cada animal (gato y perro son considerados
carnívoros y la vaca un hervíboro), incluir las interfaces necesarias para contemplar los métodos comerCarne
o comerHierba.

Una vez realizado lo mencionado, llevar a cabo en el Main la creación de diferentes animales y la invocación de sus
respectivas implementaciones de métodos.

Como propuesta extra se sugiere llamar a un método comerAnimal donde a partir del pasaje de un objeto de cualquier
tipo de animal como parámetro, invoque al método para comer según corresponda a dicho animal.
*/
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