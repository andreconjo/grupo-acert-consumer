package br.com.grupoacert.api.consumer.model;

import java.util.ArrayList;
import java.util.List;

public class ConversionList {

    private List<Conversion> conversionList = new ArrayList<>();

    public ConversionList() {
    }

    public ConversionList(List<Conversion> conversionList) {
        this.conversionList = conversionList;
    }

    public List<Conversion> getConversionList() {
        return conversionList;
    }

    public void setConversionList(List<Conversion> conversionList) {
        this.conversionList = conversionList;
    }


}
