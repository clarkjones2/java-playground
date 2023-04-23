public class Toy implements Action {

    private String name;
    public Toy(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println("Toy of brand " + name + " is making some weird noise");
    }

    @Override
    public void play(Toy toy) {
        System.out.println("Robot " + name + " is happy to see another toy " + toy);
    }

    @Override
    public String toString() {
        return name;
    }
}
