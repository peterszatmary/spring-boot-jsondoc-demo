package com.szatmary.peter.jsondoc;

import org.jsondoc.spring.boot.starter.EnableJSONDoc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableJSONDoc
public class SpringbootJsondocApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringbootJsondocApplication.class, args);
	}
}