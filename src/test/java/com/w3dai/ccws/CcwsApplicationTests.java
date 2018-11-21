package com.w3dai.ccws;

import com.hankcs.hanlp.HanLP;
import com.w3dai.ccws.Entity.PaperInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.*;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CcwsApplicationTests {

    @Autowired
    CorpusGenerator corpusGenerator;

    @Test
    public void contextLoads() throws IOException {

    }
}
