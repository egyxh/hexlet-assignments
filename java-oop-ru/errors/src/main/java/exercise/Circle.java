package exercise;

import lombok.*;

@AllArgsConstructor
public class Circle {
    private Point point;
    @Getter
    private int radius;


    public double getSquare() throws NegativeRadiusException {
        if (this.radius < 0) {
            throw new NegativeRadiusException("Radius cannot be less than 0");
        }

        return Math.PI * (radius * radius);
    }
}
