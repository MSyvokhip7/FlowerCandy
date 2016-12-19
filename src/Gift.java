import java.util.Arrays;

public class Gift {
    protected int defaultSize = 10;
    protected  int insertIndex = 0;

    protected  Candy[] gift = new Candy[defaultSize];
    private int size = 0;

    public Gift(Candy... candies) {
        for (Candy nc : candies) {
            addCandy(nc);
        }
    }

    public void addCandy(Candy nc) {
        size += 1;
        gift = Arrays.copyOfRange(gift, 0, size);
        gift[size - 1] = nc;
    }

    public float getPrice() {
        float sum = 0;
        for (Candy nc : gift) {
            sum += nc.price;
        }
        return sum;
    }

    public void sortByWeight() {
        for (int i = 1; i < size; i ++) {
            Candy tmp = gift[i];
            int j = i - 1;
            while (j >= 0 && (gift[i].getWeight() < gift[j].getWeight())) {
                gift[i] = gift[j];
                j --;
            }
            gift[j + 1] = tmp;
        }
    }

    public String toString() {
        String s = "";
        for (Candy nc : gift) {
            s += nc.toString() + "\n";
        }
        return s;
    }

    public static void main(String[] args) {
        Gift box = new Gift();
        Lollipop n1 = new Lollipop(10, 15, 1000);
        Lollipop n2 = new Lollipop(2, 7, 300);
        Chocolate n3 = new Chocolate(120, 600, 5);
        Chocolate n4 = new Chocolate(108, 350, 4);
        box.addCandy(n1);
        box.addCandy(n2);
        box.addCandy(n3);
        box.addCandy(n4);
        System.out.println(box);
        box.sortByWeight();
        System.out.println(box);
        System.out.println(box.getPrice());
    }
}
