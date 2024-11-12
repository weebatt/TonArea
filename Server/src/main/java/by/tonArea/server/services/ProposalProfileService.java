package by.tonArea.server.services;

import by.tonArea.server.DTO.ProposalInfoDTO;
import by.tonArea.server.models.ProposalInfo;
import by.tonArea.server.repositories.ProposalInfoRepository;
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
