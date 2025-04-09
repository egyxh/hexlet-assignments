package exercise;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class LabelTag implements TagInterface{
    private String tag;
    private TagInterface childTag;


    @Override
    public String render(){
        return "<label>" + this.tag + this.childTag.render() + "</label>";
    }
}
