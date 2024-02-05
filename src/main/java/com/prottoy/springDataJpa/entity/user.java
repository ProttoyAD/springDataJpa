package com.prottoy.springDataJpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(
        name = "user_table",
        schema = "jpa_demo",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "unique_names",
                        columnNames = "username"
                )
        }
)

public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private String email;
    private long number;
}
