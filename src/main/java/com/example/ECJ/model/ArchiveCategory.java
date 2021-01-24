package com.example.ECJ.model;


import lombok.*;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "archive_category")
public class ArchiveCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long archiveCategoryId;
    private String archiveCategoryName;
    private String archiveCategoryDescription;
    private int archiveCategoryActive;
}
