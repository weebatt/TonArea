package by.tonArea.server.repositories;

import by.tonArea.server.models.Proposal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProposalRepository extends JpaRepository<Proposal, Integer> {
    @Query("SELECT el FROM Proposal el WHERE el.organization.id = :organizationId")
    List<Proposal> findAllByOrganizationId(@Param("organizationId") Integer organizationId);
}

