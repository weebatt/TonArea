package by.tonArea.server.models;

import jakarta.persistence.*;
import lombok.*;

import javax.validation.constraints.NotNull;

@Entity
@Table(name = "organization")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Organization {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Column(name = "name", length = 32)
    private String name;

    @ManyToOne
    @JoinColumn(name = "wallet_id", referencedColumnName = "id")
    private Wallet wallet;
}

