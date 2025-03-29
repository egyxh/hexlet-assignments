package exercise;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Point{
    int x;
    int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}
