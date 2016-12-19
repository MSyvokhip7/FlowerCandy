public class Candy {
    protected String type;
    protected double weight;
    protected int price;
    protected int sugar;

    public int getSugar(){
        return sugar;
    }

    public void setSugar(int sugar){
        this.sugar = sugar;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String toString() {
        return "Type is: " + getType() + ", weight is: " + getWeight() + ", price is: " + getPrice() + ", Sugar amount is: " + getSugar();
    }
}
