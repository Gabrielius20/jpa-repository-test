package com.baeldung.jparepository.repository;

import com.baeldung.jparepository.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
