package com.te.entity;

import jakarta.persistence.*;
import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class BankAccount {
    @Id
    private long accountNumber;
    private String ifsc;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "bankAccount")
    private Employee employee;
}
