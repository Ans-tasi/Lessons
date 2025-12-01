public class Cat extends Animal{

    private boolean isSatiated;

    public Cat(String name, int distanceRun, int distanceSwim) {
        super("Кот", name, distanceRun, 0, false );
        this.isSatiated = false;
    }
    public void infoCat(){
        System.out.println("Кот " + name);
        System.out.println("Коты не умеют плавать!");
    }
    public void eatFromBowl(Bowl bowl, int eatForCat) {
        if(isSatiated){
            System.out.println("Кот не голоден!");
            return;
        } else if (bowl.takeFood(eatForCat)){
            isSatiated = true;
            System.out.println("Вы накормили кота " + name);
        } else {
            System.out.println("Коту " + name + " не хватает еды!");
        }
    }
    public void infoSatiety(){
        System.out.println(name + (isSatiated ? " сыт" : " голоден"));
    }
}
