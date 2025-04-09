package exercise;

import lombok.*;

@AllArgsConstructor
public class InputTag implements TagInterface{

    private String type;
    private String value;


    @Override
    public String render() {
        return "<input type=\"" + this.type + "\" value=\"" + this.value + "\">";
    }
}
