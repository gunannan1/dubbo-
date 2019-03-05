package com.stylefeng.guns.api.film.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * 电影类别vo
 */
@Data
public class CatVO implements Serializable {

    private String catId;
    private String catName;
    private boolean isActive;

}
