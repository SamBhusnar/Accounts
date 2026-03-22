package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDto;

public interface IAccountsService {
    /**
     * This method is used to create account for the customer
     *
     * @param customerDto
     */
    void createAccount(CustomerDto customerDto);
}
