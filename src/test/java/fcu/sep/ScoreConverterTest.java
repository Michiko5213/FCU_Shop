package fcu.sep;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ScoreConverterTest {
    private ScoreConverter sc;

    @Before
    public void setUo(){
        sc= new ScoreConverter();
    }

    //A;
    @Test
    public void testscA(){
        String expectedOutput ="A";
        String actualOutput= sc.getGrade(100);
        Assert.assertEquals(expectedOutput, actualOutput);


    }

    @Test
    public void testscAA(){
        String expectedOutput ="A";
        String actualOutput= sc.getGrade(90);
        Assert.assertEquals(expectedOutput, actualOutput);
    }
    //B
    @Test
    public void testscB(){
        String expectedOutput ="B";
        String actualOutput= sc.getGrade(89);
        Assert.assertEquals(expectedOutput, actualOutput);
    }
    //C
    @Test
    public void testscC(){
        String expectedOutput ="C";
        String actualOutput= sc.getGrade(78);
        Assert.assertEquals(expectedOutput, actualOutput);
    }
    //D
    @Test
    public void testscD(){
        String expectedOutput ="D";
        String actualOutput= sc.getGrade(65);
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    //F
    @Test
    public void testscF(){
        String expectedOutput ="F";
        String actualOutput= sc.getGrade(9);
        Assert.assertEquals(expectedOutput, actualOutput);
    }
    @Test
    public void testscFF(){
        String expectedOutput ="F";
        String actualOutput= sc.getGrade(1);
        Assert.assertEquals(expectedOutput, actualOutput);
    }
    @Test
    public void testscFFF(){
        String expectedOutput ="F";
        String actualOutput= sc.getGrade(45);
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    //nega
    @Test
    public void testsOut(){
        String expectedOutput ="Invalid score";
        String actualOutput= sc.getGrade(158);
        Assert.assertEquals(expectedOutput, actualOutput);
    }
    @Test
    public void testsOut2(){
        String expectedOutput ="Invalid score";
        String actualOutput= sc.getGrade(-3);
        Assert.assertEquals(expectedOutput, actualOutput);
    }
}
