package exercise;

import java.util.Map;


import lombok.*;

@Getter
@Setter
public class SingleTag extends Tag {

    SingleTag(String name, Map<String, String> atributes) {
        super (name, atributes);
    }

    @Override
    public String toString() {

        if (this.atributes == null) {
            throw new IllegalArgumentException("Invalid arguments");
        }
        if (this.name == null || this.name.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid arguments");
        }

        StringBuilder result = new StringBuilder();
        result.append("<").append(name);
        if (!this.atributes.isEmpty()) {
            this.atributes.forEach((key, value) -> {
                result.append(" ").append(key).append("=\"").append(value).append("\"");
            });
        }
        result.append(">");
        return result.toString();
    }
}

