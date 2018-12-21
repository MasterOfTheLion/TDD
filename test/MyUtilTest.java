import org.junit.Test;

import static org.junit.Assert.*;

public class MyUtilTest {
    @Test
    public void testNormal() {
        assertEquals("不及格", MyUtil.percentage2fivegrade(55));
        assertEquals("及格", MyUtil.percentage2fivegrade(65));
        assertEquals("中等", MyUtil.percentage2fivegrade(75));
        assertEquals("良好", MyUtil.percentage2fivegrade(85));
        assertEquals("优秀", MyUtil.percentage2fivegrade(95));
    }

    @Test
    public void testException() {
        assertEquals("错误", MyUtil.percentage2fivegrade(-1));
        assertEquals("错误", MyUtil.percentage2fivegrade(150));
    }

    @Test
    public void testBorder() {
        assertEquals("不及格", MyUtil.percentage2fivegrade(0));
        assertEquals("及格", MyUtil.percentage2fivegrade(60));
        assertEquals("中等", MyUtil.percentage2fivegrade(70));
        assertEquals("良好", MyUtil.percentage2fivegrade(80));
        assertEquals("优秀", MyUtil.percentage2fivegrade(100));
    }
}