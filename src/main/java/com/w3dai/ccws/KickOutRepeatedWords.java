package com.w3dai.ccws;

import com.hankcs.hanlp.HanLP;

import java.io.*;

public class KickOutRepeatedWords {
    public static void main(String[] args) throws IOException {
    BufferedReader aBufferedReader = new BufferedReader(new FileReader(new File("corpus.txt")));
    BufferedWriter aBufferedWriter = new BufferedWriter(new FileWriter(new File("newCorpus.txt")));
    String aLine;
    StringBuilder aString = new StringBuilder();
    while((aLine = aBufferedReader.readLine()) != null){
        if(aString.indexOf(aLine) == -1) {
            if(HanLP.segment(aLine).size() >= 2)
                aString.append(aLine + "\r\n");
        }
    }
    aBufferedWriter.write(aString.toString());
    aBufferedReader.close();
    aBufferedWriter.close();
    }
}
