package org.training.design.patterns.training.oo.behavioral.command;

import org.training.design.patterns.training.oo.Customer;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class MoneyTransferTask implements IBankingTask{
    @Override
    public void execute(Customer customer,
                        BigDecimal amount,
                        Map<String, Object> parameters) {
        String account1 = (String) parameters.get("orgin.account");
        String account2 = (String) parameters.get("dest.account");

    }

    @Override
    public Map<String, String> getParameterInfos() {
        Map<String,String> paramMap = new HashMap<>();
        paramMap.put("orgin.account","string");
        paramMap.put("dest.account","string");
        return paramMap;
    }

    @Override
    public String getDesc() {
        return "Para transferis";
    }
}
