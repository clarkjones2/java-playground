public class Cat extends Animal{
    private String name;

    private int age;

    @Override
    public void play() {
        System.out.println("CAT " + name + " jumps off of table");
    }

    @Override
    public void play(Toy toy) {
        System.out.println("CAT " + name + " is playing with the toy " + toy);
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
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
}
