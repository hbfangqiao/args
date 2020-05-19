import junit.framework.TestCase;
import org.junit.Test;

/**
 * @author fq
 * @create 2020-05-13
 */
public class ArgTest {

    @Test
    public void should_create_arg_given_input(){
        Schema schema = new Schema("l:boolean");
        Arg arg = new Arg(schema,"-l","true");
        TestCase.assertEquals(arg.getTag(),"l");
        TestCase.assertEquals(arg.getRowValue(),"true");
        TestCase.assertEquals(arg.getType(),"boolean");
    }

}
