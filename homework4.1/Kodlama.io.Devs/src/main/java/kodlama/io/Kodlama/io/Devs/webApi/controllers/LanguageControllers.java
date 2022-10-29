package kodlama.io.Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

@RestController
@RequestMapping("/api/languages")
public class LanguageControllers {
	
	private LanguageService languageService;
	
	
	@Autowired
	public LanguageControllers(LanguageService languageService) {
		this.languageService = languageService;
	}
	
	
	@GetMapping("/getAll")
	public List<Language> getAll(){
		return languageService.getAll();
	}
	
	
	@GetMapping("/{id}")
	public Language getLanguageId(@PathVariable ("id")int languageId) {
		return languageService.getLanguageId(languageId);
	}
	
	
	@PostMapping()
	public Language addLanguage(@RequestBody Language language) throws Exception {
		return languageService.addLanguage(language);
	}
	
	
	@PutMapping("/{id}")
	public Language updateLanguage(@PathVariable("id") int LanguageId, @RequestBody Language language) {
		
		return languageService.updateLanguage(LanguageId, language);
		
	}
	
	@DeleteMapping("/{id}")
	public Language deleteLanguage(@PathVariable("id") int LanguageId) {
		return languageService.deleteLanguage(LanguageId);
		
	}
	
	
	
	
	
	
}
