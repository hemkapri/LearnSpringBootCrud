package org.learn.repo;

import org.learn.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepository extends CrudRepository<Student, Long > {
}
