package by.titanic.server.services;

import by.titanic.server.DTO.OrganizationProfileDTO;
import by.titanic.server.DTO.ProposalDTO;
import by.titanic.server.models.Organization;
import by.titanic.server.models.OrganizationLinks;
import by.titanic.server.models.Proposal;
import by.titanic.server.repositories.OrganizationLinksRepository;
import by.titanic.server.repositories.OrganizationRepository;
import by.titanic.server.repositories.ProposalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * A class that extends OrganizationController to handle the logic for submitting data for a specific organization page
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
