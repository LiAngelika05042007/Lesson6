public class Boss extends GameEntity{
    private Weapon weapon;
    public Boss(int health, int damage, Weapon weapon) {
        setHealth(health);
        setDamage(damage);
        this.weapon = weapon;
    }
    public Weapon getWeapon() {
        return weapon;
    }
    public static String printInfo(){
        Weapon weapon = new Weapon("gun", "colt");
        Boss boss = new Boss(200, 50, weapon);
        System.out.println("Жизнь Босса: " + boss.getHealth());
        System.out.println("Урон нанесения Босса:" + boss.getDamage());
        System.out.println("Тип оружия Босса: " + boss.getWeapon().getType());
        System.out.println("Название оружия Босса:  " + boss.getWeapon().getName());
        return weapon.getName();
    }
}
