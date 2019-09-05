package br.com.grupoacert.api.consumer.service.impl;

import br.com.grupoacert.api.consumer.model.Conversion;
import br.com.grupoacert.api.consumer.model.ConversionList;
import br.com.grupoacert.api.consumer.service.ConsultasService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
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
    public List<Conversion> getAll() throws IOException {
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

        return new ObjectMapper().readValue(content.toString(),  new TypeReference<List<Conversion>>(){});
    }

}
