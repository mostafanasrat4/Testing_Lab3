package coffee;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoffeeMachineTest {

    public static CoffeeMachine cm1;
    public static CoffeeMachine2 cm2;

    @Nested
    class TopDownTesting{
        @BeforeAll
        public static void init(){
            cm1 = new CoffeeMachine();
            cm2 = new CoffeeMachine2();
        }

        @Test
        public void test1(){
            assertTrue(cm1.input('r'));
        }

        @Test
        public void test2(){
            assertTrue(cm1.input('c'));
        }

        @Test
        public void test3(){
            assertTrue(cm1.input('m'));
        }

        @Test
        public void test4(){
            assertTrue(cm1.input('w'));
        }

        @Test
        public void test5(){
            assertTrue(cm1.input('b'));
        }

        @Test
        public void test6(){
            assertTrue(cm1.input('v'));
        }

        @Test
        public void test7(){
            assertTrue(cm1.input('c'));
        }

        @Test
        public void testCm2(){
            assertFalse(cm2.useBeans());
            assertFalse(cm2.useWater());
            assertFalse(cm2.useMilk());
            assertFalse(cm2.useChoco());
            cm2.addBeans(1);
            cm2.addWater(1);
            cm2.addMilk(1);
            cm2.addChocolate(1);
            assertTrue(cm2.useBeans());
            assertTrue(cm2.useWater());
            assertTrue(cm2.useMilk());
            assertTrue(cm2.useChoco());
        }

    }


    @Nested
    class BottomUpTesting{
        @BeforeAll
        public static void init(){
            cm1 = new CoffeeMachine();
            cm2 = new CoffeeMachine2();
        }

        @Test
        public void testCm2(){
            assertFalse(cm2.useBeans());
            assertFalse(cm2.useWater());
            assertFalse(cm2.useMilk());
            assertFalse(cm2.useChoco());
            cm2.addBeans(1);
            cm2.addWater(1);
            cm2.addMilk(1);
            cm2.addChocolate(1);
            assertTrue(cm2.useBeans());
            assertTrue(cm2.useWater());
            assertTrue(cm2.useMilk());
            assertTrue(cm2.useChoco());
        }


        @Test
        public void test1(){
            assertFalse(cm1.input('c'));
        }

        @Test
        public void test2(){
            assertFalse(cm1.input('l'));
        }

        @Test
        public void test3(){
            assertFalse(cm1.input('m'));
        }

        @Test
        public void testCm4(){
            assertTrue(cm1.input('r'));
        }

        @Test
        public void testCm5(){
            assertTrue(cm1.input('c'));
        }

        @Test
        public void testCm6(){
            assertTrue(cm1.input('m'));
        }

        @Test
        public void testCm7(){
            assertTrue(cm1.input('w'));
        }

        @Test
        public void testCm8(){
            assertTrue(cm1.input('b'));
        }

        @Test
        public void testCm9(){
            assertTrue(cm1.input('v'));
        }

        @Test
        public void testCm10(){
            assertTrue(cm1.input('c'));
        }

    }

}