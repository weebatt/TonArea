package by.tonArea.server.models;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrganizationModerationId implements Serializable {

    @Column(name = "organization_id")
    private Integer organizationId;

    @Column(name = "wallet_id", length = 48)
    private String walletId;
}

