package kg.programming.languages.service;

import kg.programming.languages.model.Language;
import kg.programming.languages.repository.LanguageRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageServiceImpl implements LanguageService {
    private final LanguageRepository languageRepository;

    public LanguageServiceImpl(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @Override
    public List<Language> findAllLanguages() {
        return languageRepository.findAll();
    }

    @Override
    public Language findLanguageById(Long id) {
        return languageRepository.findById(id).get();
    }

    @Override
    public Language saveLanguage(Language c) {
        return languageRepository.save(c);
    }
}
