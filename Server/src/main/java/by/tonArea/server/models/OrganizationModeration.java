package by.tonArea.server.models;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "organization_moderation")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrganizationModeration {

    @EmbeddedId
    private OrganizationModerationId id;

    @Enumerated(EnumType.STRING)
    private ModerationStatus status;
}
