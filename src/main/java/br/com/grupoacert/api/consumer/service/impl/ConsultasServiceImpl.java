package br.com.grupoacert.api.consumer.service.impl;

import br.com.grupoacert.api.consumer.model.Conversion;
import br.com.grupoacert.api.consumer.model.resource.ConversionResource;
import br.com.grupoacert.api.consumer.model.resource.ConversionResources;
import br.com.grupoacert.api.consumer.service.ConsultasService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;


@Service
public class ConsultasServiceImpl implements ConsultasService {

    @Value("${conversion}")
    private String endpoint;

    @Override
    public ConversionResources getAll() throws IOException {
        URL url = new URL(endpoint);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        con.setConnectTimeout(5000);
        con.setReadTimeout(5000);

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer content = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();

        Gson g = new Gson();
        g.fromJson(content.toString(), ConversionResources.class);

        return g.fromJson(content.toString(), ConversionResources.class);
    }

}
