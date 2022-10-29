package kodlama.io.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

public interface LanguageService {
	List<Language> getAll();
	
	Language getLanguageId(int LanguageId);
	Language addLanguage(Language language)throws Exception;
	Language updateLanguage(int languageId,Language language);
	Language deleteLanguage(int languageId);
	
}
