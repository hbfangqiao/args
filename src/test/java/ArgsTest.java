import junit.framework.TestCase;
import org.junit.Test;

/**
 * @author fq
 * @create 2020-05-13
 */
public class ArgsTest {
    @Test
    public void should_create_and_return_3_size_given_input(){
        String schemaAsText = "l:boolean p:integer d:string";
        Schema schema = new Schema(schemaAsText);
        String[] inputText = {"-l","true","-p","8080","-d","/user/log"};
        Args args = new Args(inputText,schema);
        TestCase.assertEquals(args.size().intValue(),3);
    }

    @Test
    public void should_retrive_arg_value(){
        String[] inputText = {"-l","true","-p","8080","-d","/user/log"};
        String schemaAsText = "l:boolean p:integer d:string";
        Schema schema = new Schema(schemaAsText);
        Args args = new Args(inputText, schema);
        TestCase.assertEquals(args.valueOf("d"),"/user/log");
        TestCase.assertEquals(args.valueOf("l"),true);
        TestCase.assertEquals(args.valueOf("p"),8080);
    }
}
