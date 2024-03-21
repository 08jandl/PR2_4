package ShoppingCenter;

public class Candy {
    private String color;
    private String name;
    private double price;
    private String flavor;
    private String shape;

    public Candy(String color, String name, double price, String flavor, String shape) {
        this.color = color;
        this.name = name;
        this.price = price;
        this.flavor = flavor;
        this.shape = shape;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }
}
