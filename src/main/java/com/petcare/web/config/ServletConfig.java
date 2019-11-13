package com.petcare.web.config;

import com.petcare.web.interceptor.LoginInterceptor;
import com.petcare.web.interceptor.LogoutInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.*;

import com.petcare.web.interceptor.SampleInterceptor;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.petcare.web.controller")
public class ServletConfig implements WebMvcConfigurer {

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp("/WEB-INF/views/", ".jsp");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new SampleInterceptor());
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/loginProcess");
        registry.addInterceptor(new LogoutInterceptor()).addPathPatterns("/logout");
    }

    @Bean
    public Validator validator() {
        return new LocalValidatorFactoryBean();
    }

    @Override
    public Validator getValidator() {
        return validator();
    }
}
