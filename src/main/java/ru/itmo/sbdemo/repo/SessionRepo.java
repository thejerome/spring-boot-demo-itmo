package ru.itmo.sbdemo.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import ru.itmo.sbdemo.entities.Session;

public interface SessionRepo extends PagingAndSortingRepository<Session, Long> {
}
