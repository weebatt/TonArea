package by.tonArea.server.models;

import jakarta.persistence.*;
import lombok.*;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "organization_moderation")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrganizationModeration {

    @EmbeddedId
    private OrganizationModerationId id;

    @Pattern(regexp = "[01]", message = "Status must be either '0' - moderator or '1' - author")
    @Column(name = "moderation_status", nullable = false)
    private String moderationStatus;
}
