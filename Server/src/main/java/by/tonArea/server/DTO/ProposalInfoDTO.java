package by.tonArea.server.DTO;

import lombok.*;

/**
 * DTO для передачи информации странице конкретного предложения
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
