public class Rabbit extends Animal{
    private String eyeColor;

    public Rabbit(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    @Override
    public void play(Toy toy) {
        System.out.println("The rabbit " + name + " is eating the toy");
    }

    public void play() {
        System.out.println("Rabbit " + name + " is being still");
    }
}
