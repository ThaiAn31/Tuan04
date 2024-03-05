package com.example.redis.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.redis.entity.Student;



public interface RedisRepository extends CrudRepository<Student, Long> {
	List<Student> getAllStudents();

	Optional<Student> getStudentById(String id);

}
