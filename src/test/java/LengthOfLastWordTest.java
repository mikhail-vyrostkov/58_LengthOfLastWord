import junit.framework.TestCase;

public class LengthOfLastWordTest extends TestCase {
    public void testProfit1(){
        String s = "   fly me   to   the moon  ";
        int actual = Main.Solution.lengthOfLastWord(s);
        int expected = 4;
        assertEquals(expected, actual);
    }

    public void testProfit2(){
        String s = "luffy is still joyboy";
        int actual = Main.Solution.lengthOfLastWord(s);
        int expected = 6;
        assertEquals(expected, actual);
    }
}
