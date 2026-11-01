


class MainOld {


    static void main() {



        Cat cat = new Cat();
        cat.meaow();
        cat.meaow();

        Cat catBarsik = new Cat("Barsik");
        catBarsik.meaow();

        Cat[] cats = new Cat[2];

        cats[0] = cat;
        cats[1] = catBarsik;

        System.out.println(cats);



    }

}