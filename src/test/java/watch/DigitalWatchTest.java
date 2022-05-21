package watch;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitalWatchTest {

    public static DigitalWatch digitalWatch;
    public static DigitalWatch2 alarm;

    @Nested
    class TopDown{
        @BeforeAll
        public static void init(){
            digitalWatch = new DigitalWatch();
            alarm = new DigitalWatch2();
        }

        @Test
        public void test1(){
            assertTrue(digitalWatch.input('t'));
        }

        @Test
        public void test2(){
            assertTrue(digitalWatch.input('a'));
        }

        @Test
        public void test3(){
            assertTrue(digitalWatch.input('s'));
        }

        @Test
        public void test4(){
            assertTrue(digitalWatch.input('c'));
        }

        @Test
        public void test5(){
            assertTrue(digitalWatch.input('t'));
        }

        @Test
        public void test6(){
            assertTrue(digitalWatch.input('s'));
        }

        @Test
        public void test7(){
            assertTrue(digitalWatch.input('s'));
        }

        @Test
        public void test8(){
            assertTrue(digitalWatch.input('m'));
        }

        @Test
        public void test9(){
            assertTrue(digitalWatch.input('t'));
        }

        @Test
        public void test(){
            assertFalse(alarm.check());
            assertFalse(alarm.unset());
            assertTrue(alarm.set());
            assertTrue(alarm.check());
            assertTrue(alarm.set());
            assertFalse(alarm.set());
            assertTrue(alarm.unset());
        }

    }


    @Nested
    class BottomUp {
        @BeforeAll
        public static void init() {
            digitalWatch = new DigitalWatch();
            alarm = new DigitalWatch2();
        }

        @Test
        public void test() {
            assertFalse(alarm.check());
            assertFalse(alarm.unset());
            assertTrue(alarm.set());
            assertTrue(alarm.check());
            assertTrue(alarm.set());
            assertFalse(alarm.set());
            assertTrue(alarm.unset());
        }


        @Test
        public void test1(){
            assertTrue(digitalWatch.input('t'));
        }

        @Test
        public void test2(){
            assertTrue(digitalWatch.input('a'));
        }

        @Test
        public void test3(){
            assertTrue(digitalWatch.input('s'));
        }

        @Test
        public void test4(){
            assertTrue(digitalWatch.input('c'));
        }

        @Test
        public void test5(){
            assertTrue(digitalWatch.input('s'));
        }

        @Test
        public void test6(){
            assertTrue(digitalWatch.input('u'));
        }

        @Test
        public void test7(){
            assertTrue(digitalWatch.input('t'));
        }

        @Test
        public void test8(){
            assertTrue(digitalWatch.input('s'));
        }

        @Test
        public void test9(){
            assertTrue(digitalWatch.input('s'));
        }

        @Test
        public void test10(){
            assertTrue(digitalWatch.input('t'));
        }
    }

}