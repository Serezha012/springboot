package ru.seleznev.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.seleznev.spring.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
}
