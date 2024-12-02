package com.protofolio.Client.data.Repo;

import com.protofolio.Client.data.ClientDTO.clientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface clientRepository extends JpaRepository<clientEntity, Long> {
}
