package by.tonArea.server.DTO;

import lombok.*;

import java.util.List;
/**
 *DTO for transferring information required by a page of a specific organization
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
