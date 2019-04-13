package kg.programming.languages.controller;

import kg.programming.languages.model.Language;
import kg.programming.languages.service.LanguageService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(LanguageController.URLLANG)
public class LanguageController {
    public static final String URLLANG = "/api/language";

    private final LanguageService languageService;

    public LanguageController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping
    public List<Language> getLanguages(){
        return languageService.findAllLanguages();
    }

    @GetMapping("/{id}")
    public Language getLanguageById(@PathVariable Long id){
        return languageService.findLanguageById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Language saveLanguage(@RequestBody Language l){
        return languageService.saveLanguage(l);
    }
}
