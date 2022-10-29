package kodlama.io.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;


@Repository
public class InMemoryLanguageRepository implements LanguageRepository{
	
	List<Language> languages;
	
	public InMemoryLanguageRepository() {
		
		languages = new ArrayList<Language>();
		
		languages.add(new Language(1, "C"));
		languages.add(new Language(2, "java"));
		languages.add(new Language(3, "Python"));
		
	}

	@Override
	public List<Language> getAll() {
		// TODO Auto-generated method stub
		return languages;
	}

	@Override
	public Language getLanguageId(int languageId) {
		// TODO Auto-generated method stub
		return languages.get(languageId);
	}

	@Override
	public Language addLanguage(Language language) throws Exception {
		for(Language lang : languages) {
			if(lang.getName().equals(language.getName())) {
				throw new Exception("There is already a Language with this name");
			} else {
				languages.add(language);
			}
			
		}
		return null;
	}

	@Override
	public Language updateLanguage(int languageId, Language language) {
		
		languages.set(languageId, language);
		
		
		return null;
	}

	@Override
	public Language deleteLanguage(int languageId) {
		languages.remove(languageId);
		
		return null;
	}

}
