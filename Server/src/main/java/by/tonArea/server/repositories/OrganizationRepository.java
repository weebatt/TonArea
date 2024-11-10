package by.tonArea.server.repositories;

import by.tonArea.server.models.Organization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface OrganizationRepository extends JpaRepository<Organization, Integer> {
    @Query("SELECT el FROM Organization el WHERE el.name = :name")
    Organization findOrganizationByName(String name);
}


