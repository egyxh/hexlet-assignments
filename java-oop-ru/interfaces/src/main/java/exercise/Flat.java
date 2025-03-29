package exercise;

// BEGIN
import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.Getter;


@AllArgsConstructor
@Setter
public class Flat implements Home{
    private double area;
    private double balconyArea;
    @Getter
    private int floor;


    @Override
    public double getArea() {
        return this.area + this.balconyArea;
    }

    @Override
    public int compareTo(Home home) {
        return Double.compare(this.getArea(), home.getArea());
    }

    @Override
    public String toString() {
        return "Квартира площадью " + this.getArea() + " метров на " + this.getFloor() + " этаже";
    }
}
// END
