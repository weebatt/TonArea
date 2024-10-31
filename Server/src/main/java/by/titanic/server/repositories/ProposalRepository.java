package by.titanic.server.repositories;

import by.titanic.server.models.Proposal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProposalRepository extends JpaRepository<Proposal, Integer> {
}

