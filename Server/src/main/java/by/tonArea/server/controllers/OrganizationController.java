package by.tonArea.server.controllers;

import by.tonArea.server.DTO.OrganizationProfileDTO;
import by.tonArea.server.models.Organization;
import by.tonArea.server.services.OrganizationProfileService;
import by.tonArea.server.services.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Pageable;
import java.util.List;

@RestController
@RequestMapping("/api/organizations")
public class OrganizationController {

    @Autowired
    private OrganizationService organizationService;

    @Autowired
    private OrganizationProfileService organizationProfileService;

//    @GetMapping("/all")
//    public List<Organization> getAllOrganizations() {
//        return organizationService.getAllOrganizations();
//    }
    @GetMapping("/all")
    public List<Organization> getAllOrganizations() {
        List<Organization> organizations = organizationService.getAllOrganizations();
        System.out.println("Found organizations: " + organizations.size());
        return organizations;
    }

    @GetMapping
    public Page<Organization> getOrganizations(
            @RequestParam(value = "name", required = false) String name,
            Pageable pageable) {
        return organizationService.searchOrganizations(name, pageable);
    }

    @PostMapping
    public Organization createOrganization(@RequestBody Organization organization) {
        return organizationService.createOrganization(organization);
    }

    @GetMapping("/{orgName}")
    public OrganizationProfileDTO getOrganizationPage(@PathVariable("orgName") String name) {
        return organizationProfileService.showProfile(name);
    }
}
