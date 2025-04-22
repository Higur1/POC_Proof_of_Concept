package reflectionObject;

public class FactoryReflection {
    public static void main(String[] args) throws Exception{

        /*//old way
        Animal cat = Factory.newAnimal(Cat.class);
        cat.speak();

        Animal dog = Factory.newAnimal(Dog.class);
        dog.speak();*/

        Animal cat = Factory.newAnimal("reflectionObject.Cat");
        cat.speak();

        Animal dog = Factory.newAnimal("reflectionObject.Dog");
        dog.speak();

        /*Animal animal = Factory.newAnimal("reflection"+args[0]); //is possible instance to instance the object by command line
        animal.speak();*/
    }
}
