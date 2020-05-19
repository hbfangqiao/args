/**
 * @author fq
 * @create 2020-05-13
 */
public class ArgSpec {
    private String tag;
    private String type;

    public ArgSpec(String text) {
        String[] split = text.split(":");
        tag = split[0];
        type = split[1];
    }

    public String getTag() {
        return this.tag;
    }

    public String getType() {
        return this.type;
    }
}
