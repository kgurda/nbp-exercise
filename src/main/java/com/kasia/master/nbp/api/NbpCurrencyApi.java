package com.kasia.master.nbp.api;

import com.kasia.master.nbp.connection.HttpProvider;
import com.kasia.master.nbp.exception.NotImplementedException;
import com.kasia.master.nbp.model.Currency;

import java.math.BigDecimal;
import java.util.Date;

public class NbpCurrencyApi {

    public static final String URL = "http://www.nbp.pl/kursy/xml/c";
    public static final String CONTENT_TYPE = "application/xml";

    public BigDecimal getAverageCurrency(Currency currency, Date startDate, Date endDate) throws NotImplementedException {

        String response = HttpProvider.executeGet(URL, CONTENT_TYPE);

        throw new NotImplementedException("Jeszcze nie ma!");
    }
}
