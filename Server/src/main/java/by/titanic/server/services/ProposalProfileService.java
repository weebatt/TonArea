package by.titanic.server.services;

import by.titanic.server.DTO.ProposalInfoDTO;
import by.titanic.server.models.ProposalInfo;
import by.titanic.server.repositories.ProposalInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Класс, расширяющий ProposalController, чтобы передать данные для станицы конкретного предложения
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
