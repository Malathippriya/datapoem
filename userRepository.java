package com.assessment2.datapoem;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.assessment2.datapoem.user;

@Repository
public interface userRepository extends JpaRepository<user, Long>
{
@Query(value="select s.id, s.stname, c.projectname from user s Inner JOIN project c ON s.project=c.id", nativeQuery=true)
List<Object[]> finduser();
}
