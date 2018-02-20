package com.rest.spring.front.configuracion;

import com.rest.spring.front.AplicacionDeSeguridad;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

/**
 * rest-spring
 * com.rest.spring.front.configuracion
 * Created by winadmin in 20/2/2018.
 * Description:
 */
public class InicializadorDeSeguridad extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { AplicacionDeSeguridad.class };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return null;
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }

    @Override
    protected Filter[] getServletFilters() {
        Filter [] singleton = {(Filter) new FiltroDeCORS()};
        return singleton;
    }
}
