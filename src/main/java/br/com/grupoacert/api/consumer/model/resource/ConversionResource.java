package br.com.grupoacert.api.consumer.model.resource;

import br.com.grupoacert.api.consumer.model.Conversion;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.ResourceSupport;

public class ConversionResource {

    private Conversion conversion;

    public ConversionResource() {
    }

    public ConversionResource(Conversion conversion) {
        this.conversion = conversion;
    }

    public Conversion getConversion() {
        return conversion;
    }

    public void setConversion(Conversion conversion) {
        this.conversion = conversion;
    }
}
