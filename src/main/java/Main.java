public class Main {
    public static void main(String[] args) {
        Cat coco = new Cat("coco",14);
        coco.setName("coco II");

        Dog max = new Dog("max", 5, "Senoj");

        Rabbit snowwhite = new Rabbit("snowwhite");

        Toy curiousGeorge = new Toy("ABC corp");

        Toy legoCar = new Toy("Lego Truck");

        Action[] homeFriends = new Action[]{coco, max, snowwhite, curiousGeorge, legoCar};

        for (Action friend : homeFriends) {
            friend.play();
        }
        coco.play(legoCar);

    }
}
