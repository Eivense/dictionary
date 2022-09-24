package eivense.learning.rest.model.word;

import eivense.learning.rest.model.language.Language;

import java.io.Serializable;

/**
 * 单词接口
 *
 * @author mouyy
 * @date 2022/9/24 
 */
public interface Word extends Serializable {

    /**
     * 单词内容
     * @return 内容
     */
    String getContent();

    /**
     * 判断word属于哪种语言
     */
    Language language();

    /**
     * 翻译成指定语言
     * @param language 需要翻译的语言
     * @return 翻译的结果
     */
    String translate(Language language);
}
