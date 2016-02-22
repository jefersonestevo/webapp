package br.com.jeff.webapp.infra;

import br.com.caelum.vraptor.http.FormatResolver;
import br.com.caelum.vraptor.view.DefaultPathResolver;

import javax.enterprise.inject.Specializes;
import javax.inject.Inject;

@Specializes
public class TilesPathResolver extends DefaultPathResolver {

    @Inject
    protected TilesPathResolver(FormatResolver resolver) {
        super(resolver);
    }

    @Override
    protected String getPrefix() {
        return "/WEB-INF/pages/";
    }

    @Override
    protected String getExtension() {
        return "jsp";
    }
}
