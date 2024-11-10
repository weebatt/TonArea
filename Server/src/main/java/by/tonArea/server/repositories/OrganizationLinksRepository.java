package by.tonArea.server.repositories;

import by.tonArea.server.models.OrganizationLinks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Класс для работы с Линками организации - я не наркоман, я пытался централизовать,
 * чтобы не нужно было создавать новые объекты, но это оказался самый рациональный вариант
 */
public interface OrganizationLinksRepository extends JpaRepository<OrganizationLinks, Integer> {
    @Query("SELECT el FROM OrganizationLinks el WHERE el.organization.id = :organizationId")
    OrganizationLinks findByOrganizationId(@Param("organizationId") Integer organizationId);
}
