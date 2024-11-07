package by.titanic.server.services;

import by.titanic.server.DTO.ProposalInfoDTO;
import by.titanic.server.models.ProposalInfo;
import by.titanic.server.repositories.ProposalInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * A class that extends ProposalController to pass data for a specific proposal page
 */

@Service
public class ProposalProfileService {
    @Autowired
    ProposalInfoRepository proposalInfoRepository;

    public ProposalInfoDTO showProposalProfile(Long id) {
        ProposalInfo proposalInfo = proposalInfoRepository.findByProposalId(id);
        return new ProposalInfoDTO(proposalInfo.getFirstOptionAmount(), proposalInfo.getSecondOptionAmount(), proposalInfo.getThirdOptionAmount(),
                proposalInfo.getStartDate(), proposalInfo.getEndDate(), proposalInfo.getDescription());

    }
}
