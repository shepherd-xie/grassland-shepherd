package com.orkva.plugin.service;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.FileTemplateResolver;

public class CodeGenerateService {

    private TemplateEngine templateEngine = new TemplateEngine();

    public void foo() {
        FileTemplateResolver templateResolver = new FileTemplateResolver();
        templateResolver.setPrefix("src/main/resources/generate/");
        templateResolver.setSuffix(".txt");
        templateResolver.setTemplateMode(TemplateMode.TEXT);
        templateResolver.setCharacterEncoding("UTF-8");
        templateEngine.setTemplateResolver(templateResolver);
        Context context = new Context();
        context.setVariable("name", "World");
        String entity = templateEngine.process("hello", context);
        System.out.println(entity);
    }

}
