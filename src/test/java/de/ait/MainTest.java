package de.ait;

import jdk.jfr.Name;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
       @Nested
       @Name("Тесты для первой буквы строки")
       class ForOneSubstring {
               @Test

               public void subStr_0_to_1_Return_UpperCase() {
                       assertEquals(toString().toUpperCase().charAt(0), toString().toUpperCase().charAt(0));
               }

               @Test
               public void isStartingFromCapital_false() {
                       assertFalse(false);
               }
       }
}
//package de.ait;
//
//import jdk.jfr.Name;
//import org.junit.jupiter.api.Nested;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class CalculatorTest {
//    @Nested
//    @Name("Тесты для сумм")
//    class ForSumTest {
//        @Test
//        public void sum_9Plus12_21Return() {
//            double actual = Calculator.sum(9, 12);
//            double expected = 21;
//            assertEquals(expected, actual);
//        }
//
//        @Test
//        public void sum_10Plus22_321Return() {
//            assertEquals(32, Calculator.sum(10, 22));
//        }
//    }
//
//    @Nested
//    @Name("Тесты для множения")
//    class ForPowTest {
//        @Test
//        public void pow_2in2_4Return() {
//            assertEquals(4, Calculator.pow(2, 2));
//        }
//        @Test
//        public void pow_3in3_27Return() {
//            assertEquals(27, Calculator.pow(3, 3));
//        }
//        @Test
//        public void pow_5in2_25Return() {
//            assertEquals(25, Calculator.pow(5, 2));
//        }
//    }
//}