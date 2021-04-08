package com.wipro.Dependency;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor 
{
	@Autowired
 private SpellChecker spellchecker;
	
	public TextEditor(SpellChecker spellChecker){
	      System.out.println("Inside TextEditor constructor." );
	      this.spellchecker = spellchecker;
	   }

 
	public void Spellcheck() {
		spellchecker.Spellchecking();
	}
}
