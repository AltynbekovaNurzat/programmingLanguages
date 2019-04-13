package kg.programming.languages.service;

import kg.programming.languages.model.Language;

import java.util.List;

public interface LanguageService {
    List<Language> findAllLanguages();
    Language findLanguageById(Long id);
    Language saveLanguage(Language c);
}
