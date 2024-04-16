package org.sillysociety.graphqlserver.repository;

import org.sillysociety.graphqlserver.models.Stylist;
import org.springframework.data.repository.CrudRepository;

public interface StylistRepository extends CrudRepository<Stylist, Integer> {
}
