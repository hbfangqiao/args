/**
 * @author fq
 * @create 2020-05-13
 */
public class Arg {
    private String rowValue;
    private String tag;
    private String type;

    public Arg(Schema schema, String tag, String rowValue) {
        this.tag = tag.replace("-","");
        this.rowValue = rowValue;
        this.type = schema.specOf(this.tag);
    }

    public String getRowValue() {
        return rowValue;
    }

    public String getTag() {
        return tag;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object value() {
        if (type.equals("boolean")) return Boolean.valueOf(rowValue);
        if (type.equals("integer")) return Integer.valueOf(rowValue);
        return rowValue;
    }
}
