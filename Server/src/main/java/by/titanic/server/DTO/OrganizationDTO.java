package by.titanic.server.DTO;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrganizationDTO {
    private Integer id;
    private String name;
    private String walletId;
}

