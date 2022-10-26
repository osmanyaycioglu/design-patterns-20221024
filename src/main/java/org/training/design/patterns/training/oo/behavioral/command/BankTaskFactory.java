package org.training.design.patterns.training.oo.behavioral.command;

import org.training.design.patterns.training.oo.Customer;

import java.util.Arrays;
import java.util.List;

public class BankTaskFactory {

    public static List<IBankingTask> getCustomerTasks(Customer customer) {
        switch (customer.getCustomerType()) {
            case 1:
                return Arrays.asList(new CurrencyExchangeTask(),
                                     new MoneyTransferTask());
            case 2:
            default:
                return Arrays.asList(new MoneyTransferTask());

        }
    }
}
