package by.tonArea.server.repositories;

import by.tonArea.server.models.OrganizationLinks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *Class for working with organization Links
 */
@Repository
public interface OrganizationLinksRepository extends JpaRepository<OrganizationLinks, Integer> {
    @Query("SELECT el FROM OrganizationLinks el WHERE el.organization.id = :organizationId")
    OrganizationLinks findByOrganizationId(@Param("organizationId") Integer organizationId);
}
