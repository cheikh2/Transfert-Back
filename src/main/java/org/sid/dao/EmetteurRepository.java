package org.sid.dao;

import org.sid.entities.Emetteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EmetteurRepository extends JpaRepository<Emetteur, Long> {
}
