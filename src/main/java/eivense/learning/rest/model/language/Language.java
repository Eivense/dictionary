package eivense.learning.rest.model.language;

import org.apache.tika.language.detect.LanguageDetector;
import org.apache.tika.language.detect.LanguageResult;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * 语言接口
 *
 * @author mouyy
 * @date 2022/9/24 
 */
public interface Language extends Serializable {

    /**
     * 编码方式 默认位UTF-8
     * @return 编码方式
     */
    default Charset getCharSet(){
        return StandardCharsets.UTF_8;
    }

    /**
     * 基于ISO 639标准
     * @return 该语言对应的code
     */
    String getCode();
    /**
     * 本地名称
     *
     * @return 该语言对应的本地名称
     */
    String getLocalName();

    /**
     * 英文名称
     *
     * @return 语言对应的英文名称
     */
    String getEnglishName();


    /**
     * 判断输入的内容是否是当前语言
     * @param content 输入的内容
     * @return 是或否
     */
    default boolean support(CharSequence content, LanguageDetector languageDetector){
        LanguageResult result = languageDetector.detect(content);
        return result.getLanguage().equals(getCode());
    }

}
