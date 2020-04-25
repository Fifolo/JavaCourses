package com.starczi;

public class Main {

    public static void main(String[] args) {
        /*
        int myValue=123_345_678;

        byte myByte=-128;
        byte myByteexpression=(byte)(myByte/2);
        System.out.println("My byte value is "+myByteexpression);
        short value = 50;
        short valueshortexpression=(short)(value/2);
        System.out.println("My short value is "+valueshortexpression);
        */
        byte byte1 = 30;
        short short1=500;
        int int1=4000;
        //przy long i int nie trzeba po znaku równości wpisywać typu zmiennej;
        long value=(5000+10*(byte1+short1+int1));
        System.out.println("My long value is "+value);

    }
}
