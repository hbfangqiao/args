import java.util.ArrayList;
import java.util.List;

/**
 * @author fq
 * @create 2020-05-13
 */
public class Args {

    private List<Arg> argList = new ArrayList<>();

    public Args(String[] inputText, Schema schema) {
        for (int i = 0; i <inputText.length ; i+=2) {
            String tag = inputText[i];
            String rowValue = inputText[i+1];
            argList.add(new Arg(schema, tag,rowValue));
        }
    }

    public Integer size() {
        return 3;
    }

    public Object valueOf(String tag) {
        Arg match = argList.stream().filter(arg -> arg.getTag().equals(tag)).findFirst().get();
        return match.value();
    }
}
