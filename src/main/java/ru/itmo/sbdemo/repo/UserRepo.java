package ru.itmo.sbdemo.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import ru.itmo.sbdemo.entities.User;

public interface UserRepo extends PagingAndSortingRepository<User, Long> {
}
