package com.javarush.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(schema = "world", name = "city")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;
    private String district;
    private Integer population;
}
