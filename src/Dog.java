import java.util.Random;

public class Dog {

    int size = 3;
    String name;

    static Random r = new Random();
    static String[] names = new String[]{"Spike", "Max"};

    public Dog(String name) {
        this.name = name;

    }

    public Dog() {
        this(names[r.nextInt(names.length)]);
    }


    public void bark() {

        System.out.println("woof" + name);
    }

}
