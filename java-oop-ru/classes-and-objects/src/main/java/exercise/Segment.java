package exercise;


import lombok.Getter;
import lombok.Setter;
import java.util.Objects;

@Getter
@Setter
public class Segment{
    Point beginPoint;
    Point endPoint;

    Segment(Point beginPoint, Point endPoint){
        this.beginPoint = Objects.requireNonNull(beginPoint);
        this.endPoint = Objects.requireNonNull(endPoint);
    }

    public Point getMidPoint(){
        int midX = (this.getBeginPoint().getX() + this.getEndPoint().getX()) / 2;
        int midY = (this.getBeginPoint().getY() + this.getEndPoint().getY()) / 2;
        return new Point(midX, midY);
    }


}