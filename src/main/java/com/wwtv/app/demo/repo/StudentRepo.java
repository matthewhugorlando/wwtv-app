package com.wwtv.app.demo.repo;

import com.wwtv.app.demo.data.Student;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface StudentRepo extends PagingAndSortingRepository<Student, String> {
}