package fr.m1iii.rappel.repository;

import fr.m1iii.rappel.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findAll();

    User findById(long id);

    @Query("Select u.name from User u  where u.name like :filter")
    User findByFilter(String filter);


}
