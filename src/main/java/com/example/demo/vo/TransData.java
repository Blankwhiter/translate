package com.example.demo.vo;

import lombok.Data;

/**
 *  百度翻译结果 data
 */
@Data
public class TransData {
    /**
     * 原文
     */
    private String src;
    /**
     * 译文
     */
    private String dst;
}
