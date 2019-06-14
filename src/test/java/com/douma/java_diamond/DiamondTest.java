package com.douma.java_diamond;

import com.sun.javaws.exceptions.InvalidArgumentException;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.ArrayList;
import java.util.List;

public class DiamondTest extends TestCase
{
    public void test_diamond_number_of_outside_dots()
    {
        Diamond diamond = new Diamond();
        this.assertEquals(4, diamond.numberOfOutsideDots(0, 5));
        this.assertEquals(3, diamond.numberOfOutsideDots(1, 5));
        this.assertEquals(2, diamond.numberOfOutsideDots(2, 5));
        this.assertEquals(1, diamond.numberOfOutsideDots(3, 5));
        this.assertEquals(0, diamond.numberOfOutsideDots(4, 5));
    }

    public void test_diamond_total_chars() throws Exception
    {
        Diamond diamond = new Diamond();
        this.assertEquals(9, diamond.totalChars(0, 5));
    }

    public void test_diamond_invalid_index() throws Exception
    {
        boolean exceptionThrown = false;
        try {
            Diamond diamond = new Diamond();
            diamond.totalChars(1, 5);
        } catch(Exception e) {
            exceptionThrown = true;
        }
        this.assertTrue(exceptionThrown);
    }

    public void test_number_of_middle_dots() throws Exception
    {
        Diamond diamond = new Diamond();
        this.assertEquals(0, diamond.numberOfMiddleDots(0,5));
        this.assertEquals(1, diamond.numberOfMiddleDots(1,5));
        this.assertEquals(3, diamond.numberOfMiddleDots(2,5));
        this.assertEquals(5, diamond.numberOfMiddleDots(3,5));
        this.assertEquals(7, diamond.numberOfMiddleDots(4,5));
    }

    public void test_number_of_letters()
    {
        Diamond diamond = new Diamond();
        this.assertEquals("A", diamond.listOfLetters('A').get(0));
        this.assertEquals("B", diamond.listOfLetters('B').get(1));
        this.assertEquals("C", diamond.listOfLetters('C').get(2));
        this.assertEquals("D", diamond.listOfLetters('D').get(3));
    }

    public void test_output_b() throws Exception
    {
        Diamond diamond = new Diamond();
        String a = "·A·\n";
        a += "B·B\n";
        a += "·A·\n";
        this.assertEquals(a, diamond.output('B'));
    }

    public void test_output_e() throws Exception
    {
        Diamond diamond = new Diamond();
        String a = "····A····\n";
        a += "···B·B···\n";
        a += "··C···C··\n";
        a += "·D·····D·\n";
        a += "E·······E\n";
        a += "·D·····D·\n";
        a += "··C···C··\n";
        a += "···B·B···\n";
        a += "····A····\n";
        this.assertEquals(a, diamond.output('E'));
    }
}
