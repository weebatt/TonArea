package by.tonArea.server.models;

import jakarta.persistence.*;
import lombok.*;

import javax.validation.constraints.NotNull;

@Entity
@Table(name = "member")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member {

    @Id
    @Column(name = "id", length = 48)
    private String id;

    @NotNull
    @Column(name = "name", length = 32)
    private String name;

    @Column(name = "bio", length = 256)
    private String bio;
}

