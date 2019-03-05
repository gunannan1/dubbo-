package com.stylefeng.guns.api.film.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * 电影来源地vo
 */
@Data
public class SourceVO implements Serializable {

    private String sourceId;
    private String sourceName;
    private boolean isActive;

}
