package com.kasia.master.nbp.api;

import com.kasia.master.nbp.connection.HttpProvider;
import com.kasia.master.nbp.exception.NotImplementedException;
import com.kasia.master.nbp.model.Currency;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class NbpCurrencyApi {

    private static final String LIST_URL = "http://www.nbp.pl/kursy/xml/dir.txt";
    private static final String XML_CONTENT_TYPE = "application/xml";
    private static final String TEXT_CONTENT_TYPE = "text/plain";

    public BigDecimal getAverageCurrency(Currency currency, Date startDate, Date endDate) throws NotImplementedException {

        String response = HttpProvider.executeGet(LIST_URL, TEXT_CONTENT_TYPE);
        List<String> urls = Arrays.asList(response.split("\n"));

        throw new NotImplementedException("Jeszcze nie ma!");
    }
}
