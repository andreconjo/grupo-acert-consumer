package br.com.grupoacert.api.consumer.service;

import br.com.grupoacert.api.consumer.model.resource.ConversionResources;

import java.io.IOException;

public interface ConsultasService {

    ConversionResources getAll() throws IOException;
}
