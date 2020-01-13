package com.orkva.grassland.shepherd.service.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.templateresolver.FileTemplateResolver;

@Service
public class CodeGenerateService {

    @Autowired
    private TemplateEngine templateEngine;

    private void foo() {
        templateEngine.setTemplateResolver(new FileTemplateResolver());
    }

}
