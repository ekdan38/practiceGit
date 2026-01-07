package com.example.swyptest.repository;

import com.example.swyptest.domain.Swyp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SwypRepository extends JpaRepository<Swyp, Long> {
}
