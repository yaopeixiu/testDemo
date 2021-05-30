public abstract class Fruit {
    private String name;
    private Float price;

    public Float price(Float amount, Float price){
        return amount * price;
    }

    public abstract Float price1(Float amount, Float price);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
