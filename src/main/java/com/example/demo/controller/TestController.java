package com.example.demo.controller;

import com.example.demo.util.TranslateUtil;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

/**
 * 测试类
 */
@Slf4j
public class TestController {

    public static void main(String[] args) {
        try {
            log.info("[ ***** 中译英 ***** ]"+TranslateUtil.getTransResult("中文", "auto", "en"));
            log.info("[ ***** 英译中 ***** ]"+TranslateUtil.getTransResult("Chinese", "auto", "zh"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
