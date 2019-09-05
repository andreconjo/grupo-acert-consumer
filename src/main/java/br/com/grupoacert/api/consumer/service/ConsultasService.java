package br.com.grupoacert.api.consumer.service;

import br.com.grupoacert.api.consumer.model.Conversion;

import java.io.IOException;
import java.util.List;

public interface ConsultasService {

    List<Conversion> getAll() throws IOException;
}
