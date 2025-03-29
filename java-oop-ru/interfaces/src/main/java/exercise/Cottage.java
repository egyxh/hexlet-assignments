package exercise;

// BEGIN

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.Getter;

@AllArgsConstructor
@Setter
public class Cottage implements Home{
    private double area;
    @Getter
    private int floorCount;


    @Override
    public double getArea() {
        return this.area;
    }

    @Override
    public String toString() {
        return this.getFloorCount() + " этажный коттедж площадью " + this.getArea() + " метров";
    }

    @Override
    public int compareTo(Home home) {
        return Double.compare(this.getArea(), home.getArea());
    }
}

// END
