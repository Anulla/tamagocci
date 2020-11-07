public class Cat {
    private String name;
    private int age;
    private int hp;
    private boolean isAlive;

    public Cat() {
    }

    public Cat(String name, int age, int hp, boolean isAlive) {
        this.name = name;
        this.age = age;
        this.hp = hp;
        this.isAlive = isAlive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}
