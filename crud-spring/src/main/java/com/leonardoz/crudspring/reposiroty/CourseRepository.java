package com.leonardoz.crudspring.reposiroty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leonardoz.crudspring.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
