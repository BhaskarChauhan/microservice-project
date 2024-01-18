package com.microservice.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name = "Accounts",
        description = "Account details of the Customer"
)
public class AccountsDto {

    @Schema(
            description = "Account number of the ASPL Bank",
            example = "9483298444"
    )
    @NotEmpty(message = "Account number cannot be null or empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Account number should be 10 digits")
    private Long accountNumber;

    @Schema(
            description = "Account type of the ASPL Bank",
            example = "Savings"
    )
    @NotEmpty(message = "Account type cannot be null or empty")
    private String accountType;

    @Schema(
            description = "Branch address of the ASPL Bank",
            example = "Katraj, Pune - 411043"
    )
    @NotEmpty(message = "Branch address cannot be null or empty")
    private String branchAddress;
}
