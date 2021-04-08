package com.wipro.Dependency;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Textconfig {

	@Bean
	public TextEditor t1() {
		return new TextEditor( sp() );
	}
	
	@Bean
	public SpellChecker sp() {
		return new SpellChecker();
	}
}
