package comparable_comparator;

public class Product implements Comparable<Product> {
    private int weight;
    private int price;
    private int id;

    Product(int weight, int price, int id) {
        this.weight = weight;
        this.price = price;
        this.id = id;
    }

    public int getWeight() {
        return this.weight;
    }

    public int getPrice() {
        return this.price;
    }

    public int getId() {
        return this.id;
    }

    public static void main(String[] args) {

    }

    @Override
    public int compareTo(Product o) {
        // TODO Auto-generated method stub
        return Integer.compare(this.price, o.price);
    }

}
