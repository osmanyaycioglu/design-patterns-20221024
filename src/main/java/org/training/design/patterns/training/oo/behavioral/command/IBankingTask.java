package org.training.design.patterns.training.oo.behavioral.command;

import org.training.design.patterns.training.oo.Customer;

import java.math.BigDecimal;
import java.util.Map;

public interface IBankingTask {

    void execute(Customer customer,
                 BigDecimal amount,
                 Map<String,Object> parameters);

    Map<String,String> getParameterInfos();

    String getDesc();
}
