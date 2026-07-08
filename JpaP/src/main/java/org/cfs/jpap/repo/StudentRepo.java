package org.cfs.jpap.repo;

import org.cfs.jpap.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Long> {
}
