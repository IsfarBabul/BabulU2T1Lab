public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Tabby", 4, 23.6);
        cat1.introduce();
        cat1.printCatInfo();
        Cat cat2 = new Cat("Mittens", 34, 22.7);
        cat2.printCatInfo();
        cat2.introduce();
    }
}
