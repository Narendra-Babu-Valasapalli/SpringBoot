package AnnotationConfiguration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"AnnotationConfiguration"})
@PropertySource(value = { "Resources " })
public class ConfigurationClass {
	

}