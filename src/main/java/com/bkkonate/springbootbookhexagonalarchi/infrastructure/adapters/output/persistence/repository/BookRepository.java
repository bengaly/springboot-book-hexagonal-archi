package com.bkkonate.springbootbookhexagonalarchi.infrastructure.adapters.output.persistence.repository;

import com.bkkonate.springbootbookhexagonalarchi.infrastructure.adapters.output.persistence.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, Long> {
}
