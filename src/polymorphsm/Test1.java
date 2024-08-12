package polymorphsm;

public class Test1 {
    public static void main(String[] args) {
        Animal animal1 = new Wolf();
        animal1.run();
        go(animal1);

        Animal animal2 = new Tortoise();
        animal2.run();
        go(animal2);
    }
    public static void go(Animal animal){
        if (animal instanceof Wolf) {
            Wolf wolf = (Wolf) animal;
            System.out.println(wolf.name);
            wolf.eatsheep();
        } else if (animal instanceof Tortoise) {
            Tortoise tortoise = (Tortoise) animal;
            System.out.println(tortoise.name);
            tortoise.eatcao();

        }

    }

}

