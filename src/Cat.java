import java.util.Random;

public class Cat {

    int size = 3;
    String name;

    static Random r = new Random();
    static String[] names = new String[]{"Barsik", "Vaska"};

    public Cat(String name) {
        this.name = name;

    }

    public Cat() {
        this(names[r.nextInt(names.length)]);
    }


    public void meaow() {

        System.out.println("measooow" + name);
    }

}
