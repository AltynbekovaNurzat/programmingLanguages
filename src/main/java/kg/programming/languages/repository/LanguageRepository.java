package kg.programming.languages.repository;

import kg.programming.languages.model.Language;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguageRepository extends JpaRepository<Language,Long> {
}
