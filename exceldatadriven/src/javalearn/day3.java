package javalearn;

import org.testng.annotations.Test;

public class day3 {
    @Test
    public void alto(){
        System.out.println("Alto");
    }

    @Test
    public void BMW(){
        System.out.println("BMW");

    }
    @Test(timeOut = 4000)
    public void Audi(){
        System.out.println("Audi");

    }

    @Test
    public void Pangani(){
        System.out.println("PANGANI");

    }
}
