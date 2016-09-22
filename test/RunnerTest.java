import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Brice on 9/21/16.
 */
public class RunnerTest {

    Runner myRunner = new Runner();
    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    // Testing closeFar()

    @Test
    public void noClose() throws Exception {
        assertFalse(myRunner.closeFar(1,3,5));
    }

    @Test
    public void allCloseNoFar() throws Exception {
        assertFalse(myRunner.closeFar(1,2,3));
    }

    @Test
    public void aCloseBFarC() throws Exception {
        assertTrue(myRunner.closeFar(4,5,10));
    }

    @Test
    public void aFarBCloseC() throws Exception {
        assertTrue(myRunner.closeFar(3,7,2));
    }

    @Test
    public void aSameBfarC() throws Exception {
        assertTrue(myRunner.closeFar(3, 3, 6));
    }


    // Testing luckySum()

    @Test
    public void luckySumA13() throws Exception {
        assertEquals(0, myRunner.luckySum(13, 1, 1));
    }

    @Test
    public void luckySumAokB13() throws Exception {
        assertEquals(7, myRunner.luckySum(7, 13, 2));
    }

    @Test
    public void luckySumAokBokC13() throws Exception {
        assertEquals(20, myRunner.luckySum(15, 5, 13));
    }

    @Test
    public void luckySumAokBokCok() throws Exception {
        assertEquals(14, myRunner.luckySum(7, 3, 4));
    }

    // Testing maxBlock()

    @Test
    public void maxBlockNotEmpty() throws Exception {
        assertEquals(3, myRunner.maxBlock("AAAabcaada"));
    }

    @Test
    public void maxBlockEmpty() throws Exception {
        assertEquals(0, myRunner.maxBlock(""));
    }

    @Test
    public void maxBlockLots() throws Exception {
        assertEquals(8, myRunner.maxBlock("thisAAAAAAAAndTHaat"));
    }

    @Test
    public void maxBlockFour() throws Exception {
        assertEquals(4, myRunner.maxBlock("XX2222BBBbbXX2222"));
    }

    @Test
    public void mirrorEndsWords() throws Exception {
        assertEquals("derp", myRunner.mirrorEnds("derpaherpiepred"));
    }

    @Test
    public void mirrorEndsNone() throws Exception {
        assertEquals("", myRunner.mirrorEnds("thisisi"));
    }

    @Test
    public void mirrorEndsAll() throws Exception {
        assertEquals("yayay", myRunner.mirrorEnds("yayay"));
    }

    @Test
    public void sumNumbersNone() throws Exception {
        assertEquals(0, myRunner.sumNumbers("AbccdEfhdjkfa"));
    }

    @Test
    public void sumNumbersSome() throws Exception {
        assertEquals(17, myRunner.sumNumbers("aasddff9fnjabk8"));
    }

    @Test
    public void sumNumbersAll() throws Exception {
        assertEquals(777, myRunner.sumNumbers("700 60 17"));
    }

    @Test
    public void sumNumbersSomeMore() throws Exception {
        assertEquals(19, myRunner.sumNumbers("9ddf3ffdah7"));
    }

    @Test
    public void sumNumbersSimpleTest() throws Exception {
        assertEquals(2, myRunner.sumNumbers("1 01"));
    }

}