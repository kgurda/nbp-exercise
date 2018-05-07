package com.kasia.master.nbp;

import com.kasia.master.nbp.api.NbpCurrencyApi;
import com.kasia.master.nbp.exception.NotImplementedException;
import com.kasia.master.nbp.model.Currency;

import java.util.Date;

public class MainClass {

    private static NbpCurrencyApi api = new NbpCurrencyApi();

    public static void main(String[] args) {
        try {
            api.getAverageCurrency(Currency.USD, new Date(1), new Date(1));
        } catch(NotImplementedException ex) {
            ex.printStackTrace();
        }
        System.out.println("aaaa");
    }
}
