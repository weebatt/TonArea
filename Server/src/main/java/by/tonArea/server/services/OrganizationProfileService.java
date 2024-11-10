package by.tonArea.server.services;

import by.tonArea.server.DTO.OrganizationProfileDTO;
import by.tonArea.server.DTO.ProposalDTO;
import by.tonArea.server.models.Organization;
import by.tonArea.server.models.OrganizationLinks;
import by.tonArea.server.models.Proposal;
import by.tonArea.server.repositories.OrganizationLinksRepository;
import by.tonArea.server.repositories.OrganizationRepository;
import by.tonArea.server.repositories.ProposalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс, расширяющий OrganizationController, чтобы обработать логику отправки данных для страницы конкретной организации
 */
@Service
public class OrganizationProfileService {
    @Autowired
    private OrganizationRepository organizationRepository;

    @Autowired
    private OrganizationLinksRepository organizationLinksRepository;

    @Autowired
    private ProposalRepository proposalRepository;


    public OrganizationProfileDTO showProfile(String name) {
        Organization organization = organizationRepository.findOrganizationByName(name);
        OrganizationLinks organizationLinks = organizationLinksRepository.findByOrganizationId(organization.getId());
        List<Proposal> proposals = proposalRepository.findAllByOrganizationId(organization.getId());
        List<ProposalDTO> proposalDTOList = new ArrayList<>();
        for (Proposal proposal : proposals) {
            ProposalDTO proposalDTO = new ProposalDTO(proposal.getId(), proposal.getTopic(), proposal.getStatus(), proposal.getMapOfOptions());
            proposalDTOList.add(proposalDTO);
        }
        return new OrganizationProfileDTO(organization.getName(), proposalDTOList, organizationLinks.getGithub(), organizationLinks.getX(), organizationLinks.getTelegram());
    }

}
