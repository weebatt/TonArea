package by.titanic.server.models;

import by.titanic.server.models.Organization;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "organization_links")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrganizationLinks {
//
    @Id
    private Integer organization_id;

    //Предлагаю переименовать слобец id в organization_id для этой сущности, так как нам не нужно отдельного id для линков
    @OneToOne
    @JoinColumn(name = "organization_id", referencedColumnName = "id")
    private Organization organization;

    @Column(name = "telegram", length = 128)
    private String telegram;

    @Column(name = "x", length = 128)
    private String x;

    @Column(name = "github", length = 128)
    private String github;
}
