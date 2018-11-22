package com.w3dai.ccws;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import com.ansj.vec.Learn;
import com.ansj.vec.Word2VEC;


public class Word2VecTest {
    private static final File sportCorpusFile = new File("article.txt");

    public static void main(String[] args) throws IOException {
        //进行分词训练
        //Learn lean = new Learn() ;

       // lean.learnFile(sportCorpusFile) ;

        //lean.saveModel(new File("vector.mod")) ;



        //加载测试

        Word2VEC w2v = new Word2VEC() ;

        w2v.loadJavaModel("vector.mod") ;

        // 假设map是HashMap对象
        // map中的key是String类型，value是Integer类型
        String key = null;
        Integer integ = null;
        Iterator iter = w2v.getWordMap().keySet().iterator();
        int i=0;
        while (iter.hasNext()) {
            // 获取key
            key = (String)iter.next();
            System.out.println(w2v.getWordMap().get(key));
        }

    }
}
