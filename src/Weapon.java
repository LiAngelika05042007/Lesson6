public class Weapon {
    private String type;// тип оружия
    private String name;//название оружия
    public Weapon(String type, String name){
        this.type = type;
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public String getName() {
        return name;
    }
}
