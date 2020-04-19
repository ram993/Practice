package javalearn;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class day1 {

        @AfterSuite
        public void Demo()
    {
            System.out.println("hello");
        }
        @Test
        public void Video()
        {
            System.out.println("Play");
        }
        @Test
        public void Intrest()
        {
            System.out.println("Test");
        }




}
