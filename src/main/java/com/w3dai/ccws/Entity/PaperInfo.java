package com.w3dai.ccws.Entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "paperinfo")
public class PaperInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date Doc_Time;
    private String Title;
    private String Intro_Title;
    private String Sub_Title;
    private String Authors;
    private byte[] Content;
    private String Page_Num;
    private String Page_Name;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public Date getDoc_Time() {
        return Doc_Time;
    }

    public void setDoc_Time(Date doc_Time) {
        Doc_Time = doc_Time;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getIntro_Title() {
        return Intro_Title;
    }

    public void setIntro_Title(String intro_Title) {
        Intro_Title = intro_Title;
    }

    public String getSub_Title() {
        return Sub_Title;
    }

    public void setSub_Title(String sub_Title) {
        Sub_Title = sub_Title;
    }

    public String getAuthors() {
        return Authors;
    }

    public void setAuthors(String authors) {
        Authors = authors;
    }

    public byte[] getContent() {
        return Content;
    }

    public void setContent(byte[] content) {
        Content = content;
    }

    public String getPage_Num() {
        return Page_Num;
    }

    public void setPage_Num(String page_Num) {
        Page_Num = page_Num;
    }

    public String getPage_Name() {
        return Page_Name;
    }

    public void setPage_Name(String page_Name) {
        Page_Name = page_Name;
    }
}
