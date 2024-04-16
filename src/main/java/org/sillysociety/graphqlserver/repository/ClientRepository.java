package org.sillysociety.graphqlserver.repository;

import org.sillysociety.graphqlserver.models.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client, Integer> {
}
