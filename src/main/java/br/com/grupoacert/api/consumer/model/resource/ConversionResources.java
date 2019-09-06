package br.com.grupoacert.api.consumer.model.resource;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.ResourceSupport;

import java.util.List;

public class ConversionResources {

    private List<ConversionResource> conversions;

    public ConversionResources(List<ConversionResource> conversions) {
        this.conversions = conversions;
    }

    public List<ConversionResource> getConversions() {
        return conversions;
    }

    public void setConversions(List<ConversionResource> conversions) {
        this.conversions = conversions;
    }
}