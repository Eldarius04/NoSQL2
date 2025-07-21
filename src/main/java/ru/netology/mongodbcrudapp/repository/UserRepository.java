package ru.netology.mongodbcrudapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import ru.netology.mongodbcrudapp.model.User;

import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {
    List<User> findByName(String name);  // Поиск по имени
    List<User> findByAge(Integer age);   // Поиск по возрасту
}
