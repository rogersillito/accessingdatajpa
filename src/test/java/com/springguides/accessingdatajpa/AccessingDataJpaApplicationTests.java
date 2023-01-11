package com.springguides.accessingdatajpa;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.StreamSupport;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;

@SpringBootTest(properties = { "command.line.runner.enabled=false" })
class AccessingDataJpaApplicationTests {

    @Autowired
    CustomerRepository repository;

    @Test
    void AccessingDataJpaApplication_saveCustomers_persistsExpected() {
		AccessingDataJpaApplication.saveCustomers(repository);
        var customerList = StreamSupport.stream(repository.findAll().spliterator(), false).toList();
        assertThat(customerList, hasSize(5));
    }

}
