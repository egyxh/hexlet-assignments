package exercise;

import java.util.stream.Collectors;
import java.util.Map;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public abstract class Tag {

    protected String name;
    protected Map<String, String> atributes;


    public abstract String toString();
}
