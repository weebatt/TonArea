package by.tonArea.server.DTO;

import lombok.*;

import java.util.List;
/**
 *DTO для преедачи информации, необходимой странице конкретной организации
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrganizationProfileDTO {
    private String nameOfOrganization;
    private List<ProposalDTO> proposalDTOList;
    private String githubLink;
    private String xLink;
    private String telegramLink;
}
