package com.te.entity;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Address {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer addressId;
    private String country;
    private String state;
    private String city;

    @Enumerated
    private AddressType addressType;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Employee employee;
}
