package com.taas.Pastryandhop.entity.model;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Getter
@Setter
@Builder
@DynamicUpdate
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "\"pastry_shop\"")
public class PastryShop {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.SEQUENCE, generator = "pastry_shop_generator")
    @SequenceGenerator(name = "pastry_shop_generator", sequenceName = "pastry_shop_seq", allocationSize = 1)
    private Integer id;

    @Column
    private String Address;


}
