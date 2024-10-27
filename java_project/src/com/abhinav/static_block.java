package com.abhinav;

public class static_block {
    static int a = 2;
    static int b;

    static {
        b = a * 4;
        System.out.println("this is static block");
    }

    public static void main(String[] args) {

        System.out.println(static_block.a + static_block.b);

        static_block.b += 3;
        System.out.println(static_block.a + static_block.b);
        
    }
}
