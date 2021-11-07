import org.junit.jupiter.api.Test;
import ro.uvt.p3.lab7a.Example;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExampleTest {

    @Test
    void test(){
        Example a = new Example("a", "some text here");
        assertEquals("a", a.getName(), "wrong name");
        assertEquals("some text here", a.getText(), "wrong text");
    }
}
