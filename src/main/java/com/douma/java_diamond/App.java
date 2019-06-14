package com.douma.java_diamond;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
        if(args.length == 0) {
            throw new Exception("No letter provided");
        }

        Diamond diamond = new Diamond();
        System.out.println(diamond.output(args[0].charAt(0)));
    }
}
