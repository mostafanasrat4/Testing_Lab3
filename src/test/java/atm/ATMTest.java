package atm;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ATMTest {

    public static ATM atm1;
    public static ATM2 atm2;

    @Nested
    class TopDownTesting{
        @BeforeAll
        public static void init(){
            atm1 = new ATM();
            atm2 = new ATM2();
        }

        @Test
        public void test1(){
            assertTrue(atm1.input('l'));
        }

        @Test
        public void test3(){
            assertTrue(atm1.input('d'));
        }

        @Test
        public void test4(){
            assertTrue(atm1.input('o'));
        }

        @Test
        public void test5(){
            assertTrue(atm1.input('u'));
        }

        @Test
        public void test6(){
            assertTrue(atm1.input('f'));
        }

        @Test
        public void test7(){
            assertTrue(atm1.input('l'));
        }

        @Test
        public void test(){
            assertFalse(atm2.withdraw());
            atm2.deposit(1);
            assertTrue(atm2.withdraw());
            assertFalse(atm2.withdraw());
            atm2.deposit(3);
            assertTrue(atm2.withdraw());
            assertTrue(atm2.withdraw());
            assertTrue(atm2.withdraw());
        }

    }


    @Nested
    class BottomUpTesting{
        @BeforeAll
        public static void init(){
            atm1 = new ATM();
            atm2 = new ATM2();
        }

        @Test
        public void testatm2(){
            assertFalse(atm2.withdraw());
            atm2.deposit(1);
            assertTrue(atm2.withdraw());
            assertFalse(atm2.withdraw());
            atm2.deposit(3);
            assertTrue(atm2.withdraw());
            assertTrue(atm2.withdraw());
            assertTrue(atm2.withdraw());
        }


        @Test
        public void test1(){
            assertTrue(atm1.input('l'));
        }

        @Test
        public void test2(){
            assertFalse(atm1.input('w'));
        }

        @Test
        public void test3(){
            assertTrue(atm1.input('d'));
        }

        @Test
        public void test4(){
            assertTrue(atm1.input('w'));
        }

        @Test
        public void test5(){
            assertTrue(atm1.input('o'));
        }

        @Test
        public void test6(){
            assertTrue(atm1.input('u'));
        }

        @Test
        public void test7(){
            assertTrue(atm1.input('f'));
        }

        @Test
        public void test8(){
            assertTrue(atm1.input('l'));
        }

        @Test
        public void test9(){
            assertTrue(atm1.input('l'));
        }

    }

}