package org.training.design.patterns.training.oo.examples.printer.services;

import org.training.design.patterns.training.oo.Customer;
import org.training.design.patterns.training.oo.examples.printer.EGender;
import org.training.design.patterns.training.oo.examples.printer.facade.IPrintFacade;
import org.training.design.patterns.training.oo.examples.printer.facade.PrintData;
import org.training.design.patterns.training.oo.examples.printer.facade.PrinterFacadeFactory;
import org.training.design.patterns.training.oo.examples.printer.facade.ProvisionFacade;

public class PrintService {

    IPrintFacade printFacade = PrinterFacadeFactory.createPrinterFacade();
    ProvisionFacade provisionFacade = new ProvisionFacade();

    public void addToSystem(Customer customer){
        provisionFacade.addCustomer(customer);
        EGender eGender = EGender.MALE;

        PrintData printData = new PrintData();
        printData.setName(customer.getCustomerDetailsIm().getName());
        printData.setName(customer.getCustomerDetailsIm().getSurname());
        printData.setGender(eGender);
        printFacade.print(printData);


    }


}
