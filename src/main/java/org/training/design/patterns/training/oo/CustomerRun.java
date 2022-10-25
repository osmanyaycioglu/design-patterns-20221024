package org.training.design.patterns.training.oo;

public class CustomerRun {
    public static void main(String[] args) {
        CustomerDetails customer = new CustomerDetails();
        customer.setName("osman");
        customer.setSurname("yaycıoğlu");

        System.out.println("xyz");
        for (int i = 0; i < args.length; i++) {
            System.out.println("test");
        }
        // customer yaratıldı
        customer.setName("ali");
        customer.setCounter(10);
        // sonrasında
        customer.setCounter(20);

        CustomerDetails customerDetails2 = CustomerDetails.createCustomerDetails()
                                                          .setName("osman")
                                                          .setSurname("yay")
                                                          .setCounter(10)
                                                          .setHeight(200)
                                                          .setWeight(100);

        CustomerDetails customerDetails = new CustomerDetails("osman",
                                                              "yaycıoğlu",
                                                              10,
                                                              200,
                                                              100);


        CustomerDetailsIm customerImmutable = new CustomerDetailsIm("osman",
                                                                    "yaycıoğlu");

    }
}
