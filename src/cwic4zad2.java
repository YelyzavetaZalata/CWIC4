import java.util.Objects;

class Car {
    private String model, brand, color;
    private int year, price, quantity;

    public Car(String model, String color, String brand, int year, int price, int quantity) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.color = color;
        this.quantity = quantity;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && price == car.price && quantity == car.quantity && Objects.equals(model, car.model) && Objects.equals(brand, car.brand) && Objects.equals(color, car.color);
    }
    @Override
    public int hashCode() {
        return Objects.hash(model, brand, year, price, color, quantity);
    }
    void sell(int sold) {
        quantity -= sold;
    }

    void delivery(int delivery) {
        quantity += delivery;
    }

}
    public class cwic4zad2 {
    public static void main(String[] args) {

        Car car1 = new Car(" E55 AMG Avantgarde W210", "white", "Mercedes", 1999, 120000, 5);

        System.out.println(car1.toString());

        System.out.println(car1.getColor());

        car1.sell(2);

        car1.delivery(1);

        int year = car1.getYear();

        car1.setColor("black");

        System.out.println(car1.toString());
    }
}
