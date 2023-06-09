package com.sujit.api.repository;



import com.sujit.api.model.Book;
import com.sujit.api.model.Lend;
import com.sujit.api.model.LendStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LendRepository extends JpaRepository<Lend, Long> {
    Optional<Lend> findByBookAndStatus(Book book, LendStatus status);
}
