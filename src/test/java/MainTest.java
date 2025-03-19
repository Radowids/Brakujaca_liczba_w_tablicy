import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.programujodpodstaw.Main;

public class MainTest {
    int[] integersArray1 = {1,2,3,5,6};
    int[] integersArray2 = {10,11,15,23,13,14};
    int[] integersArray3 = {1,3,1,1,1};
    int[] integersArray4 = {-1,254,257,256,6};
    int[] integersArray5 = {25,25,26,28,54};
    int[] integersArray6 = {4,0,0,0,6};


    @Test
    public void testMain1(){
        Assertions.assertEquals(4, Main.getMissingNumber(integersArray1));
    }
    @Test
    public void testMain2(){
        Assertions.assertEquals(12, Main.getMissingNumber(integersArray2));
    }
    @Test
    public void testMain3(){
        Assertions.assertEquals(2, Main.getMissingNumber(integersArray3));
    }
    @Test
    public void testMain4(){
        Assertions.assertEquals(7, Main.getMissingNumber(integersArray4));
    }
    @Test
    public void testMain5(){
        Assertions.assertEquals(27, Main.getMissingNumber(integersArray5));
    }
    @Test
    public void testMain6(){
        Assertions.assertEquals(5, Main.getMissingNumber(integersArray6));
    }
}
