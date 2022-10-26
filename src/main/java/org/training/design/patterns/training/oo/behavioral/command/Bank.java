package org.training.design.patterns.training.oo.behavioral.command;

import java.math.BigDecimal;
import java.util.Scanner;

public class Bank {

    public void menu() {
        System.out.println("1-para transferi");
        System.out.println("2-doviz alma");
        System.out.println("seçiminiz:");
    }

    public void execute(int index,
                        Scanner scanner) {
        if (index == 1) {
            MoneyTransfer moneyTransfer = new MoneyTransfer();
            System.out.println("para transferi hesap no : ");
            String destAccount = scanner.nextLine();
            System.out.println("miktar : ");
            BigDecimal amount = scanner.nextBigDecimal();

            moneyTransfer.transfer(null,
                                   null,
                                   destAccount,
                                   amount);
        } else if (index == 2) {
            CurrencyExchange currencyExchange = new CurrencyExchange();
            System.out.println("doviz tipi : ");
            String currency = scanner.nextLine();
            System.out.println("miktar : ");
            BigDecimal amount = scanner.nextBigDecimal();

            currencyExchange.exchange(null,
                                   currency,
                                   amount);
        }
    }

}
