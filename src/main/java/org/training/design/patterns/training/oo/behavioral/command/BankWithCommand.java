package org.training.design.patterns.training.oo.behavioral.command;

import org.training.design.patterns.training.oo.Customer;

import java.math.BigDecimal;
import java.util.*;

public class BankWithCommand {


    public void execute(int index,
                        Customer customer,
                        Scanner scanner) {
        List<IBankingTask> bankingTaskList = BankTaskFactory.getCustomerTasks(customer);
        IBankingTask iBankingTask = bankingTaskList.get(index);
        Map<String, String> parameterInfos = iBankingTask.getParameterInfos();
        Set<Map.Entry<String, String>> entries = parameterInfos.entrySet();
        Map<String, Object> paramMap = new HashMap<>();
        for (Map.Entry<String, String> entry :
                entries) {
            System.out.println(entry.getKey());
            switch (entry.getValue()) {
                case "string":
                    String s = scanner.nextLine();
                    paramMap.put(entry.getKey(),
                                 s);
                    break;
                default:
                    break;
            }
        }
        System.out.println("amount : ");
        BigDecimal amount = scanner.nextBigDecimal();
        iBankingTask.execute(customer,amount,paramMap);
    }

    public void showMenu(Customer customer) {
        List<IBankingTask> bankingTaskList = BankTaskFactory.getCustomerTasks(customer);
        for (int i = 1; i < bankingTaskList.size() + 1; i++) {
            IBankingTask iBankingTask = bankingTaskList.get(i - 1);
            System.out.println(i + "-" + iBankingTask.getDesc());

        }
    }

}
