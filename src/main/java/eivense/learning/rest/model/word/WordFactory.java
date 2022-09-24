package eivense.learning.rest.model.word;

import eivense.learning.rest.model.language.Language;

/**
 * 单词工厂
 *
 * @author mouyy
 * @date 2022/9/24 
 */
public interface WordFactory {

    /**
     * 根据语言类型创建对应的word
     * @param content 单词内容
     * @param language 指定的语言
     * @return 对应的word
     */
    Word createWord(String content, Language language);
}
