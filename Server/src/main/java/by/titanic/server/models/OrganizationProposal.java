package by.titanic.server.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "organization_proposal")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrganizationProposal {

    @EmbeddedId
    private OrganizationProposalId id;
}
