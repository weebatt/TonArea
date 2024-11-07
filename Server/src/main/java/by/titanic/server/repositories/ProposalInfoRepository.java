package by.titanic.server.repositories;

import by.titanic.server.models.ProposalInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProposalInfoRepository extends JpaRepository<ProposalInfo, Long> {
    @Query("SELECT el FROM ProposalInfo el WHERE el.proposal.id = :id")
    ProposalInfo findByProposalId(@Param("id") Long id);
}
