package com.w3dai.ccws;

import com.hankcs.hanlp.HanLP;

import java.io.*;

public class HanLPTest {
public static void main(String[] args) throws IOException {
    BufferedReader aBufferedReader = new BufferedReader(new FileReader(new File("corpus.txt")));
    String aLine;
    while((aLine = aBufferedReader.readLine()) != null){
        String aNewString = HanLP.segment(aLine).toString();
        if(aNewString.contains("nr")&&aNewString.contains(","))
            System.out.println(aNewString);
    }
}
}
