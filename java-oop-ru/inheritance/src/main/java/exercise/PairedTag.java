package exercise;

import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;
import lombok.*;

@Getter
@Setter
public class PairedTag extends Tag {

    private String body;
    private List<Tag> kids;

    public PairedTag(String name, Map<String, String> atributes, String body, List<Tag> kids) {
        super(name, atributes);
        this.body = body != null ? body : "";
        this.kids = kids != null ? kids : new ArrayList<>();
    }

    @Override
    public String toString() {
        if (this.name == null || this.name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }

        StringBuilder result = new StringBuilder();

        result.append("<").append(name);
        this.atributes.forEach((key, value) -> {
            result.append(" ").append(key).append("=\"").append(value).append("\"");
        });
        result.append(">").append(body != null ? body : "");
        if (kids != null) {
            kids.forEach(singleTag -> result.append(singleTag.toString()));
        }
        result.append("</").append(name).append(">");
        return result.toString();
    }
}
