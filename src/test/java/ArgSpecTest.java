import junit.framework.TestCase;
import org.junit.Test;

/**
 * @author fq
 * @create 2020-05-13
 */
public class ArgSpecTest {

    @Test
    public void should_create_argSpec_given_text(){
        ArgSpec argSpec = new ArgSpec("l:boolean");
        TestCase.assertEquals(argSpec.getTag(),"l");
        TestCase.assertEquals(argSpec.getType(),"boolean");
    }
}
