package com.innoq.talks.mybatisspringboot;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface CustomerMapper {

    Optional<Customer> findById(final Long id);

    List<Customer> searchByNames(final String firstName, final String lastName);

    void insertCustomer(final Customer customer);

    void deleteCustomer(final Long id);
}
