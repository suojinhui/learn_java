package MovieDemo;

public class Movice {
    private int id;
    private String name;
    private double price;
    private String actors;

    public Movice() {}

    public Movice(int id, String name, double price, String actors) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.actors = actors;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
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
}
