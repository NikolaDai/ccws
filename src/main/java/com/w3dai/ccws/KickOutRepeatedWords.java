package com.w3dai.ccws;

import com.hankcs.hanlp.HanLP;
import com.w3dai.ccws.Entity.PaperInfo;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.*;
import java.util.List;

public class KickOutRepeatedWords {
    @Autowired
    static CorpusGenerator corpusGenerator;

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

    List<PaperInfo> paperList = corpusGenerator.find();
    BufferedWriter aWriter = new BufferedWriter(new FileWriter(new File("article.txt")));
    for(int i = 0; i < paperList.size(); i++){
        String aContent = new String(paperList.get(i).getContent(),"utf-8");
        //paperList.get(i).getTitle() + " " +
        aContent =  aContent.replaceAll("<table.*?>[\\s\\S]*?</table>", "").replaceAll("&lt;|/?p&gt;|/?strong&gt;|&nbsp|/font&gt","")
                .replaceAll("font.+&gt;", "").replaceAll("<p.*>|</p>|</?strong>", "").replaceAll("(p|P)\\s[\\s\\S]*?&gt;?","");
        if(aContent.contains("true&quot")) {
            System.out.println(aContent);
            System.out.println("****************************************************************************************************************************************************************");
        }
        String aNewString = HanLP.segment(aContent).toString();
        aWriter.write(aNewString);
    }
    aWriter.close();
    }
}
