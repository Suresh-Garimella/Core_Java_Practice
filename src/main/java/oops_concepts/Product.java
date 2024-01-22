package oops_concepts;

class Product {
    private Double price;

    public Double getPrice() {
        return price;
    }

    public Double getPrice(int qty) {
        return qty * price;
    }

    public void setPrice(Double i) {
        this.price = i;
    }

}
