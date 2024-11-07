package by.titanic.server.DTO;

import lombok.*;

/**
 * DTO for passing information to a specific offer page
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProposalInfoDTO {
    private Integer firstOptionAmount;
    private Integer secondOptionAmount;
    private Integer thirdOptionAmount;
    private java.sql.Timestamp startDate;
    private java.sql.Timestamp endDate;
    private String description;
}
