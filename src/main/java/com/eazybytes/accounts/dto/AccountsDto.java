package com.eazybytes.accounts.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class AccountsDto {
    // not empty not work on long it only works on string , collection,map, array
    @NotEmpty(message = "Account number cannot be empty or null")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "AccountNumber must be 10 digits")
    private Long accountNumber;

//    @NotNull(message = "Account number cannot be null")
//    @Pattern(regexp = "(^$|[0-9]{10})", message = "AccountNumber must be 10 digits")
//    private String accountNumber;

    @NotEmpty(message = "Account type cannot be empty or null")
    private String accountType;

    @NotEmpty(message = "Branch address cannot be empty or null")
    private String branchAddress;

}
