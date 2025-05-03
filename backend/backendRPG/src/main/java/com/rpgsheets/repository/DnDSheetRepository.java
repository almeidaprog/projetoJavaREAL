package com.rpgsheets.repository;

import com.rpgsheets.model.DnDSheet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DnDSheetRepository extends JpaRepository<DnDSheet, Long> {
}
