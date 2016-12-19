public class Flower {
    protected int price;
    protected int freshness;
    protected int height;
    protected String type;

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public int getFreshness(){
        return freshness;
    }

    public void setFreshness(int freshness){
        this.freshness = freshness;
    }

    public int getHeight(){
        return height;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public String toString() {
        return "Type is: " + getType() + ", height is: " + getHeight() + ", price is: " + getPrice() + ", freshness is: " + getFreshness();
    }
}
