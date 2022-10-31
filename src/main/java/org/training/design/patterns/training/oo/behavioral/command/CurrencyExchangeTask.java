package org.training.design.patterns.training.oo.behavioral.command;

import org.training.design.patterns.training.oo.Customer;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class CurrencyExchangeTask implements IBankingTask {
    @Override
    public void execute(Customer customer,
                        BigDecimal amount,
                        Map<String, Object> parameters) {
        String str = (String) parameters.get("currency");
        // exchange
    }

    @Override
    public Map<String, String> getParameterInfos() {
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("currency",
                     "string");
        return paramMap;
    }

    @Override
    public String getDesc() {
        return "Döviz alış";
    }

}
