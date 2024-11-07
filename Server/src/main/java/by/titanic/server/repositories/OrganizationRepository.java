package by.titanic.server.repositories;

import by.titanic.server.models.Organization;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface OrganizationRepository extends JpaRepository<Organization, Integer> {
//    @Query("SELECT el FROM Organization el WHERE el.name = :name")
    Organization findOrganizationByName(String name);
    Page<Organization> findByNameContainingIgnoreCase(String name, Pageable pageable);
}


