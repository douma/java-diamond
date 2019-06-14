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

    private String outputLetter(int index, String letter, int numberOfLetters) throws Exception
    {
        int numberOfMiddleDots = this.numberOfMiddleDots(index, numberOfLetters);
        int numberOfOutsideDots = this.numberOfOutsideDots(index, numberOfLetters);

        String output = "";
        for(int x = 0; x<numberOfOutsideDots;x++) {
            output += "·";
        }

        output += letter;
        if(numberOfMiddleDots > 0) {
            for(int x = 0; x<numberOfMiddleDots;x++) {
                output += "·";
            }
            output += letter;
        }

        for(int x = 0; x<numberOfOutsideDots;x++) {
            output += "·";
        }
        return output;
    }

    public String output(char letter) throws Exception
    {
        List<String> letters = this.listOfLetters(letter);
        int numberOfLetters = letters.size();
        String output = "";

        int index = 0;
        for(String letterLoop : letters) {
            output += this.outputLetter(index, letterLoop, numberOfLetters) + "\n";
            index++;
        }
        index = index - 2;
        for(int x = index; x>=0;x--) {
            output += this.outputLetter(x, letters.get(x), numberOfLetters) + "\n";
        }
        return output;
    }
}
