public class ZooManagement {
    public static void main(String[] args) {
        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Zoo myZoo = new Zoo("myZoo", "Zoo City", 30, 25);
        myZoo.animals[0] = lion;

        myZoo.displayZoo();
        System.out.println(myZoo);
        System.out.println(lion);
    }
}
