import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author fq
 * @create 2020-05-13
 */
public class Schema {

    private List<ArgSpec> argList;

    public Schema(String schemaAsText) {
        String[] s = schemaAsText.split(" ");
        argList = Arrays.stream(s).map(ArgSpec::new).collect(Collectors.toList());
    }

    public Integer getSize() {
        return argList.size();
    }

    public String specOf(String tag) {
        return argList.stream().filter(spec -> spec.getTag().equals(tag)).findFirst().get().getType();
    }
}
