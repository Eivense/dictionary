package eivense.learning.rest.model.language.impl;

import eivense.learning.rest.model.language.Language;

/**
 * 英文
 * @author mouyy
 * @date 2022/9/24 
 */
public class English implements Language {

    private English(){
    }

    @Override
    public String getCode() {
        // ISO-691里的code
        return "en";
    }

    @Override
    public String getLocalName() {
        return "English";
    }

    @Override
    public String getEnglishName() {
        return "English";
    }
}
