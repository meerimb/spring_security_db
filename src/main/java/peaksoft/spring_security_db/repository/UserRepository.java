package peaksoft.spring_security_db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import peaksoft.spring_security_db.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("select u from User u where u.username=:username")
    public User getUserByUsername(@Param("username")String username);
}