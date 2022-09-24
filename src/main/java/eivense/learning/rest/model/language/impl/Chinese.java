package eivense.learning.rest.model.language.impl;

import eivense.learning.rest.model.language.Language;

/**
 * 中文
 * 
 * @author mouyy
 * @date 2022/9/24 
 */
public class Chinese implements Language {


    private Chinese(){
    }

    @Override
    public String getCode() {
        // ISO-691里的code
        return "zh";
    }

    @Override
    public String getLocalName() {
        return "中文";
    }

    @Override
    public String getEnglishName() {
        return "Chinese";
    }

}
