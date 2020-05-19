import junit.framework.TestCase;
import org.junit.Test;

/**
 * @author fq
 * @create 2020-05-13
 */
public class SchemaTest {

    @Test
    public void should_return_3_size_given_schemaAsText(){
        String schemaAsText = "l:boolean p:integer d:string";
        Schema schema = new Schema(schemaAsText);
        TestCase.assertEquals(schema.getSize().intValue(),3);
    }

    @Test
    public void should_retrun_type_given_flag(){
        String schemaAsText = "l:boolean p:integer d:string";
        Schema schema = new Schema(schemaAsText);
        TestCase.assertEquals(schema.specOf("l"),"boolean");
    }
}
