package com.example.ECJ.repository;

import com.example.ECJ.model.ArchiveCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArchiveCategoryRepository extends JpaRepository<ArchiveCategory, Long> {
}
