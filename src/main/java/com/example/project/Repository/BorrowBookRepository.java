package com.example.project.Repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.project.Models.Book;
import com.example.project.Models.BorrowBook;

@Repository
public interface BorrowBookRepository extends JpaRepository<BorrowBook, Integer> {

	@Query(value = "select bb.Book from BorrowBook bb where  bb.date=?1", nativeQuery = true)
	List<Book> findByDate(Date date);

}
