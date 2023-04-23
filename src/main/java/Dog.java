public class Dog extends Animal{
    private String name;
    private int age;
    private String owner;

    public Dog(String name, int age, String owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    public void play() {
        System.out.println("Dog " + name + " is chasing his tail");
    }

    @Override
    public void play(Toy toy) {
        System.out.println("Dog " + name + " is trying to eat the toy");
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

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}