package eivense.learning.service.language;

import eivense.learning.rest.model.language.Language;

import javax.enterprise.context.ApplicationScoped;
import java.util.Collection;

/**
 * 语言注册器
 *
 * @author mouyy
 * @date 2022/9/24 
 */
public interface LanguageRegistry {

    /**
     * 当前注册的所有语言
     */
    Collection<Language> getLanguages();

    /**
     * 注册语言
     * @param language
     */
    void register(Language language);

    /**
     * 注销语言
     * @param language 语言
     * @return
     */
    Language unregister(Language language);

}
