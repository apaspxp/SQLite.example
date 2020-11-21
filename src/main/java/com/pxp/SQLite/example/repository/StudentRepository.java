package com.pxp.SQLite.example.repository;

import com.pxp.SQLite.example.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    public Boolean existsByEmail(String email);

    public List<Student> findByEmail(String email);

    @Query("select max(s.id) from Student s")
    public Integer findMaxId();
}
