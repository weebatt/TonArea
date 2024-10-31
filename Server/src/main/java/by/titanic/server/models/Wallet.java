package by.titanic.server.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "wallet")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Wallet {

    @Id
    @Column(name = "id", length = 48)
    private String id;

    @Column(name = "name", length = 32)
    private String name;

    @Column(name = "bio", length = 256)
    private String bio;
}

