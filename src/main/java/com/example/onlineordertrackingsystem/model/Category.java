package com.example.onlineordertrackingsystem.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "uuid")
    private String uuid;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "created_at")
    private LocalDate createdAt;
    @Column(name = "updated_at")
    private LocalDate updatedAt;
    @OneToMany(mappedBy = "category")
    private List<Product> productList;

}
