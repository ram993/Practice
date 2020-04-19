package javalearn;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day2 {
    @Test
    public void Housing(){
        System.out.println("4 Bedroom");
    }

    @Test
    public void Housing3(){
        System.out.println("3 Bedroom");

    }

    @BeforeSuite

    public void Housing2(){
        System.out.println("2 Bedroom");

    }
}
