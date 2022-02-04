import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void additionTest() {
        assertNotEquals(2, SkillDemo.SkillDemoAdd(1, 1));
    }
}