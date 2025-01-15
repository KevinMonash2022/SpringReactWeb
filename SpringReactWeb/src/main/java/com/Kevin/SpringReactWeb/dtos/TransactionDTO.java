package com.Kevin.SpringReactWeb.dtos;

import com.Kevin.SpringReactWeb.enums.TransactionStatus;
import com.Kevin.SpringReactWeb.enums.TransactionType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TransactionDTO {

    private Long id;

    private Integer totalProducts;

    private BigDecimal totalPrice;


    private TransactionType transactionType; // perchase, sale, return


    private TransactionStatus transactionStatus; // pending, completed, cancelled

    private String note;
    private String description;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    private ProductDTO product;

    private UserDTO user;

    private SupplierDTO supplier;


}
