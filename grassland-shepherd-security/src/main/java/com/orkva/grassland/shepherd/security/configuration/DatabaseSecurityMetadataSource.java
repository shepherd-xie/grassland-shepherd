package com.orkva.grassland.shepherd.security.configuration;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.util.AntPathMatcher;
import sun.security.krb5.Realm;

import java.util.Collection;
import java.util.List;

public class DatabaseSecurityMetadataSource implements FilterInvocationSecurityMetadataSource {
    private FilterInvocationSecurityMetadataSource superMetadataSource;
    private final AntPathMatcher antPathMatcher = new AntPathMatcher();


    public DatabaseSecurityMetadataSource(FilterInvocationSecurityMetadataSource expressionBasedFilterInvocationSecurityMetadataSource) {
        superMetadataSource = expressionBasedFilterInvocationSecurityMetadataSource;
    }

    @Override
    public Collection<ConfigAttribute> getAttributes(Object object) throws IllegalArgumentException {
        FilterInvocation fi = (FilterInvocation) object;
        String url = fi.getRequestUrl();
        List<Object> attributes = Lists.newArrayList();

        if (!attributes.isEmpty()) {
            return SecurityConfig.createList(attributes.toArray(new String[0]));
        }

        //  返回代码定义的默认配置
        return superMetadataSource.getAttributes(object);
    }

    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return FilterInvocation.class.isAssignableFrom(clazz);
    }
}