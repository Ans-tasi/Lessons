public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat ("Барсик", 200, 0);
        cat.infoCat();
        cat.run(30);
        cat.swim(10);

        Dog dog = new Dog("Шарик", 500, 10);
        dog.infoDog();
        dog.run(20);
        dog.swim(2);

        Bowl bowl = new Bowl(50);

        Cat[] catsArray = new Cat[5];
        catsArray[0] = new Cat("Марсик", 200, 0);
        catsArray[1] = new Cat("Мурзик", 200, 0);
        catsArray[2] = new Cat("Барсик", 200, 0);
        catsArray[3] = new Cat("Мартин", 200, 0);
        catsArray[4] = new Cat("Бантик", 200, 0);

        catsArray[0].eatFromBowl(bowl, 10);
        catsArray[0].infoSatiety();
        System.out.println(" ");
        catsArray[1].eatFromBowl(bowl, 11);
        catsArray[1].infoSatiety();
        System.out.println(" ");
        catsArray[2].eatFromBowl(bowl, 12);
        catsArray[2].infoSatiety();
        System.out.println(" ");
        catsArray[3].eatFromBowl(bowl, 13);
        catsArray[3].infoSatiety();
        System.out.println(" ");
        catsArray[4].eatFromBowl(bowl, 14);
        catsArray[4].infoSatiety();




    }

}
