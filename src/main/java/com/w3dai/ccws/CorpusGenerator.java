package com.w3dai.ccws;

import com.w3dai.ccws.Entity.PaperInfo;
import com.w3dai.ccws.Repository.PaperInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CorpusGenerator{
    private PaperInfoRepository paperInfoRepository;

    @Autowired
    public CorpusGenerator(PaperInfoRepository aPaperInfoRepository){
        paperInfoRepository = aPaperInfoRepository;
    }

    public List<PaperInfo> find(){
       return paperInfoRepository.findAll();
    }
}
