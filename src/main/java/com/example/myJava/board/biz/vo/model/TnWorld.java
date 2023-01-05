package com.example.myJava.board.biz.vo.model;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("TnWorld")
public class TnWorld {
    private String Id;
    private String name;
    private String countryCode;
    private String district;
    private int population;
}
