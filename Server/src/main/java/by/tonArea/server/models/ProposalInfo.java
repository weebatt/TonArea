package by.tonArea.server.models;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "proposal_info")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProposalInfo {

    @Id
    @Column(name = "id")
    private Integer id;

    @OneToOne
    @JoinColumn(name = "id", referencedColumnName = "id", insertable = false, updatable = false)
    private Proposal proposal;

    @Column(name = "first_option_amount")
    private Integer firstOptionAmount;

    @Column(name = "second_option_amount")
    private Integer secondOptionAmount;

    @Column(name = "third_option_amount")
    private Integer thirdOptionAmount;

    @Column(name = "start_date", nullable = false)
    private java.sql.Timestamp startDate;

    @Column(name = "end_date", nullable = false)
    private java.sql.Timestamp endDate;

    @Column(name = "description", columnDefinition = "TEXT", nullable = false)
    private String description;
}
