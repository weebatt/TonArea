package by.tonArea.server.repositories;

import by.tonArea.server.models.ProposalInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProposalInfoRepository extends JpaRepository<ProposalInfo, Long> {
    @Query("SELECT el FROM ProposalInfo el WHERE el.proposal.id = :id")
    ProposalInfo findByProposalId(@Param("id") Long id);
}
