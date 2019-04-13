package kg.programming.languages.bootstrap;

import kg.programming.languages.model.Language;
import kg.programming.languages.repository.LanguageRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class LanguageBootstrap implements CommandLineRunner {
    private final LanguageRepository languageRepository;

    public LanguageBootstrap(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Language l1 = new Language("Java",20);
        Language l2 = new Language("Python",17);
        Language l3 = new Language("C#",15);
        languageRepository.save(l1);
        languageRepository.save(l2);
        languageRepository.save(l3);
    }
}
