package org.sid.dao;

import org.sid.entities.Recepteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RecepteurRepository extends JpaRepository<Recepteur, Long> {
}
