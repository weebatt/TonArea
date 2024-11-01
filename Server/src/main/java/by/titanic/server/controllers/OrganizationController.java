package by.titanic.server.controllers;

import by.titanic.server.DTO.OrganizationProfileDTO;
import by.titanic.server.models.Organization;
import by.titanic.server.services.OrganizationProfileService;
import by.titanic.server.services.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/organizations")
public class OrganizationController {

    @Autowired
    private OrganizationService organizationService;

    @Autowired
    private OrganizationProfileService organizationProfileService;


    @GetMapping
    public List<Organization> getAllOrganizations() {
        return organizationService.getAllOrganizations();
    }

    @PostMapping
    public Organization createOrganization(@RequestBody Organization organization) {
        return organizationService.createOrganization(organization);
    }

    /**
     *Метод возвращает информацию для страницы, на которую мы переходим при выборе компании
     */
    @GetMapping("/{orgName}")
    public OrganizationProfileDTO getOrganizationPage(@PathVariable("orgName") String name) {
        return organizationProfileService.showProfile(name);
    }
}

