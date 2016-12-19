public class FlowerBucket {
    private int defaultSize = 10;
    private int insertIndex = 0;
    protected  Flower[] flowers = new Flower[defaultSize];

    public void addFlower(Flower nw) {
        checkSize();
        flowers[insertIndex] = nw;
        insertIndex ++;
    }

    private void checkSize(){
        if (insertIndex == defaultSize - 1) {
            defaultSize *= 2;
            Flower[] b = new Flower[defaultSize];
            for (int i = 0; i <= insertIndex; i ++) {
                b[i] = flowers[i];
            }
            flowers = b;
        }
    }
    public void sortByPrice() {
        for (int i = 1; i < insertIndex; i ++) {
            Flower tmp = flowers[i];
            int j = i - 1;
            while (j >= 0 && (flowers[i].getPrice() < flowers[j].getPrice())) {
                flowers[i] = flowers[j];
                j --;
            }
            flowers[j + 1] = tmp;
        }
    }
    public String toString() {
        String s = "";
        for (int i = 0; i < insertIndex; i ++) {
            s += flowers[i].toString() + "\n";
        }
        return s;
    }

    public double getTotalPrice() {
        double sum = 0;
        for (int i = 0; i < insertIndex; i ++) {
            sum += flowers[i].getPrice();
        }
        return sum;
    }

    public static void main(String[] args) {
        FlowerBucket box = new FlowerBucket();
        Cactus n1 = new Cactus(10, 15, 1);
        Cactus n2 = new Cactus(4, 7, 2);
        Tulip n3 = new Tulip(120, 600, 5);
        Tulip n4 = new Tulip(108, 350, 4);
        box.addFlower(n1);
        box.addFlower(n2);
        box.addFlower(n3);
        box.addFlower(n4);
        System.out.println(box);
        box.sortByPrice();
        System.out.println(box);
        System.out.println(box.getTotalPrice());
    }
}
