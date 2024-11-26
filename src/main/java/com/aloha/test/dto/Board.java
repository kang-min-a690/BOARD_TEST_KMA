package com.aloha.test.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
public class Board {

    private int no;
    private String id;
    private String title;
    private String writer;
    private String content;
    private Date createdAt;
    private Date updatedAt;

    private List<MultipartFile> fileList;       // 파일 목록
    private List<String> deleteFiles;           // 삭제할 파일 ID 목록

    public Board() {
        this.id = UUID.randomUUID().toString();
    }
    
    
}
