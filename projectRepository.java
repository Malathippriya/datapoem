package com.assessment2.datapoem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.assessment2.datapoem.project;

@Repository
public interface projectRepository extends JpaRepository<project, Long>{

}
