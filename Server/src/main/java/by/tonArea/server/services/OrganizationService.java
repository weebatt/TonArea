package by.tonArea.server.services;

import by.tonArea.server.models.Organization;
import by.tonArea.server.repositories.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganizationService {
    @Autowired
    private OrganizationRepository organizationRepository;

    public List<Organization> getAllOrganizations() {
        return organizationRepository.findAll();
    }

    public Organization createOrganization(Organization organization) {
        return organizationRepository.save(organization);
    }
    public Organization getOrganizationById(Integer id) {
        return organizationRepository.getReferenceById(id);
    }


}

