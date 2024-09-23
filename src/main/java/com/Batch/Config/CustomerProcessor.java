package com.Batch.Config;

import com.Batch.Entity.Customer;
import org.springframework.batch.item.ItemProcessor;
public class CustomerProcessor implements ItemProcessor<Customer, Customer> {

    @Override
    public Customer process(Customer item) throws Exception {

        // logic

        return item;
    }

}
