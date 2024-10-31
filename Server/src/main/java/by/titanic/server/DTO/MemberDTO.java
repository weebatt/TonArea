package by.titanic.server.DTO;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MemberDTO {
    private String id;
    private String name;
    private String bio;
}

