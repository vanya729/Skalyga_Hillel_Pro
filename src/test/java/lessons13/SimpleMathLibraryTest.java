package lessons13;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class SimpleMathLibraryTest {
    SimpleMathLibrary simpleMathLibrary = new SimpleMathLibrary();

    @DisplayName("Test plus")
    @Test
    public void testPlus(){
        double result = simpleMathLibrary.add(4.0, 4.0);
//        assertEquals(8.0 ,result, 0.001);
        if (result==7.0){
            System.out.println("OK");
        }else {
            System.out.println("NOK");
        }
    }

    @DisplayName("Test minus")
    @Test
    public void testMinus(){
        double result = simpleMathLibrary.minus(4.0, 3.0);
//        assertEquals(1.0 ,result, 0.001);
        if (result == 1.0) {
            System.out.println("OK");
        } else {
            System.out.println("NOK");
        }
    }

    @DisplayName("ArrayWith4Test1")
    @Test
    public void testArr1(){
        int[] arr ={5,6,7,8,4,1,2};
        int[] res ={1,2};
        int[] resultArr =simpleMathLibrary.afterLastFour(arr);
        assertArrayEquals(res,resultArr);
    }

    @DisplayName("ArrayWith4Test2")
    @Test
    public void testArr2(){
        int[] arr ={4,5,6,4,1,4,7,8,4,1,4,2,5,7};
        int[] res ={2,5,7};
        int[] resultArr =simpleMathLibrary.afterLastFour(arr);
        assertArrayEquals(res,resultArr);
    }

    @DisplayName("ArrayWith4Test3")
    @Test
    public void testArr3(){
        int[] arr ={1,5,7,8,9,6,1,2,3,7};
        assertThrows(RuntimeException.class, ()-> simpleMathLibrary.afterLastFour(arr));
    }

    @DisplayName("ArrayWith4Test4")
    @Test
    public void testArr4(){
        int[] arr ={1,5,7,8,9,6,1,2,3,7,4};
        int[] res ={};
        int[] resultArr =simpleMathLibrary.afterLastFour(arr);
        assertArrayEquals(res,resultArr);
    }

    @Test
    @DisplayName("ArrayWith4And1Test1")
    public void testOneAndFour1(){
        int[] arr ={1,1,1,4,4,4,1};
        assertTrue(simpleMathLibrary.afterLastFourAndOne(arr));
    }

    @Test
    @DisplayName("ArrayWith4And1Test2")
    public void testOneAndFour2(){
        int[] arr ={1,1,1,1,1,1,1};
        assertFalse(simpleMathLibrary.afterLastFourAndOne(arr));
    }

    @Test
    @DisplayName("ArrayWith4And1Test3")
    public void testOneAndFour3(){
        int[] arr ={4,4,4,4,4,4};
        assertFalse(simpleMathLibrary.afterLastFourAndOne(arr));
    }

    @Test
    @DisplayName("ArrayWith4And1Test4")
    public void testOneAndFour4(){
        int[] arr ={1,1,1,4,4,4,1,7};
        assertFalse(simpleMathLibrary.afterLastFourAndOne(arr));
    }

}
