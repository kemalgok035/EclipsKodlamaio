package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;
@Service
public class LanguageManager implements LanguageService{
	
	private LanguageRepository languageRepository;
	
	@Autowired
	public LanguageManager (LanguageRepository languageRepository) {
		
		this.languageRepository = languageRepository;
		
		
	}

	@Override
	public List<Language> getAll() {
		// TODO Auto-generated method stub
		return languageRepository.getAll();
	}

	@Override
	public Language getLanguageId(int LanguageId) {
		return languageRepository.getLanguageId(LanguageId);
	}

	@Override
	public Language addLanguage(Language language) throws Exception {
		if(language.getName().isEmpty() || language.getName().isBlank()) {
			throw new Exception("Programming Language Can Not Be Blank");
		}
		return languageRepository.addLanguage(language);
	}

	@Override
	public Language updateLanguage(int languageId, Language language) {
		// TODO Auto-generated method stub
		return languageRepository.updateLanguage(languageId, language);
	}

	@Override
	public Language deleteLanguage(int languageId) {
		// TODO Auto-generated method stub
		return languageRepository.deleteLanguage(languageId);
	}

}
