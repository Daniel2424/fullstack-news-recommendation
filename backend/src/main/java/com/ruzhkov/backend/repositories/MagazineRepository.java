package com.ruzhkov.backend.repositories;

import com.ruzhkov.backend.entites.Magazine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MagazineRepository extends JpaRepository<Magazine, Integer> {
}
