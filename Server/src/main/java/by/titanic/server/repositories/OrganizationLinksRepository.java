package by.titanic.server.repositories;

import by.titanic.server.models.OrganizationLinks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *Class for working with organization Links
 */
public interface OrganizationLinksRepository extends JpaRepository<OrganizationLinks, Integer> {
    @Query("SELECT el FROM OrganizationLinks el WHERE el.organization.id = :organizationId")
    OrganizationLinks findByOrganizationId(@Param("organizationId") Integer organizationId);
}
