public class Skeleton extends Boss{
    private Weapon numberOfArrows;
    public Skeleton(int health, int damage, Weapon numberOfArrows) {
        super(health, damage, numberOfArrows);
        this.numberOfArrows = numberOfArrows;
    }
    public Weapon getNumberOfArrows() {
        return numberOfArrows;
    }
    public static String printInfo(){
        Weapon weapon = new Weapon("bow", "arrow");
        Skeleton skeleton = new Skeleton(100, 20, weapon);
        System.out.println("Жизнь Скелета: " + skeleton.getHealth());
        System.out.println("Урон нанесения Скелета:" + skeleton.getDamage());
        System.out.println("Тип оружия Скелета: " + skeleton.getNumberOfArrows().getType());
        System.out.println("Название оружия Скелета:  " + skeleton.getWeapon().getName());
        return weapon.getName();
    }
}