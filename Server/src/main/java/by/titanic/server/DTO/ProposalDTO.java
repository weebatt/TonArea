package by.titanic.server.DTO;

import lombok.*;

import java.util.HashMap;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProposalDTO {
    private Integer id;
    private String topic;
    private String status;
    private HashMap<String, String> options;
}

