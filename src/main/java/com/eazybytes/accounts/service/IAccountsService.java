package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDto;

public interface IAccountsService {
    /**
     * This method is used to create account for the customer
     *
     * @param customerDto
     */
    void createAccount(CustomerDto customerDto);

    /**
     *
     * This method is used to fetch account details for the customer
     *
     * @param mobileNumber
     * @return CustomerDto
     */
    CustomerDto fetchAccount(String mobileNumber);

    /**
     * This method is used to update account details for the customer
     *
     * @param customerDto
     * @return boolean
     */
    boolean updateAccount(CustomerDto customerDto);


    /**
     *
     * This method is used to delete account for the customer
     *
     * @param mobileNumber
     * @return boolean
     */
    boolean deleteAccount(String mobileNumber);

}
