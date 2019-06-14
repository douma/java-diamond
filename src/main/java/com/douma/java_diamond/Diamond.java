package com.douma.java_diamond;

import java.util.ArrayList;
import java.util.List;

class Diamond
{
    public int numberOfOutsideDots(int index, int numberOfLetters)
    {
        return numberOfLetters - (index + 1);
    }

    public int totalChars(int index, int numberOfLetters) throws Exception
    {
        if(index == 0)
        {
            int numberOfOutsideDots = this.numberOfOutsideDots(0, numberOfLetters);
            return 1 + numberOfOutsideDots + numberOfOutsideDots;
        }
        throw new Exception("Cannot resolve total chars, only for index 0");
    }

    public int numberOfMiddleDots(int index, int numberOfLetters) throws Exception
    {
        int numberOfOutsideDots = this.numberOfOutsideDots(index, numberOfLetters);
        int totalChars = this.totalChars(0, numberOfLetters);
        int totalNumberOfOutsideDots = totalChars - 2 - (numberOfOutsideDots * 2);
        return (totalNumberOfOutsideDots < 0) ? 0 : totalNumberOfOutsideDots;
    }

    public List<String> listOfLetters(char to)
    {
        List<String> list = new ArrayList<String>();
        for (char c = 'A'; c <= to; c++) {
            list.add(String.valueOf(c));
        }
        return list;
    }
}
