package com.Kevin.SpringReactWeb.dtos;

import com.Kevin.SpringReactWeb.enums.UserRole;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class TransactionRequest {

    @NotBlank(message = "Product id is required")
    private String productId;

    @NotBlank(message = "Quantity id is required")
    private String quantity;

    private Long supplierId;

    private String description;

    private String note;
}
