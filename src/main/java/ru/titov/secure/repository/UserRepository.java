package ru.titov.secure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.titov.secure.model.UserEntity;

/**
 * @autor : Anton Titov {@literal antontitow@bk.ru}
 * @created : 28.07.2023, 2:20
 **/
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    @Query("select u from users u where id = ?1")
    UserEntity getById(Long id);
}
