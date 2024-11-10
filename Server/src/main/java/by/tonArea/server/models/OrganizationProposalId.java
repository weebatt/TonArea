package by.tonArea.server.models;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrganizationProposalId implements Serializable {

    @Column(name = "organization_id")
    private Integer organizationId;

    @Column(name = "proposal_id")
    private Integer proposalId;
}

