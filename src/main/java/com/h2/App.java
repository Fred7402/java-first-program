package com.h2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public static int doubleTheNumber(int number) {
        return 2 * number;
    }

    private static int add(int[] number) {
        int sum = 0;
        for(int Integer : number) {
            sum += Integer;
        }
        return sum;
    }
}
