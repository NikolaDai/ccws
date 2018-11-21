package com.w3dai.ccws;

import java.io.File;
import java.io.IOException;
import com.ansj.vec.Learn;
import com.ansj.vec.Word2VEC;


public class Word2VecTest {
    private static final File sportCorpusFile = new File("article.txt");

    public static void main(String[] args) throws IOException {
        //进行分词训练

        Learn lean = new Learn() ;

        lean.learnFile(sportCorpusFile) ;

        lean.saveModel(new File("model/vector.mod")) ;



        //加载测试

        Word2VEC w2v = new Word2VEC() ;

        w2v.loadJavaModel("model/vector.mod") ;

        System.out.println(w2v.distance("姚明"));

    }
}
