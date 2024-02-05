package com.prottoy.springDataJpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(
        name = "user_table",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "unique_names",
                        columnNames = "username"
                )
        }
)

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;
    private String username;
    private String email;
    @CreationTimestamp
    private LocalDateTime dateCreated;
    @UpdateTimestamp
    private LocalDateTime dateUpdated;
}
