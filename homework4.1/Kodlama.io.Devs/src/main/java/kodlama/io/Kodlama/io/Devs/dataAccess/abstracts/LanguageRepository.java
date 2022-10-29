package kodlama.io.Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

public interface LanguageRepository {

	
	List<Language>getAll();
	
	Language getLanguageId(int languageId);
	Language addLanguage(Language language)throws Exception;
	Language updateLanguage(int languageId,Language language);
	Language deleteLanguage(int languageId);
}
