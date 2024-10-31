package by.titanic.server.models;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "proposal")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Proposal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "first_option", length = 64, nullable = false)
    private String firstOption;

    @Column(name = "second_option", length = 64, nullable = false)
    private String secondOption;

    @Column(name = "third_option", length = 64)
    private String thirdOption;

    @Column(name = "start_date", nullable = false)
    private java.sql.Timestamp startDate;

    @Column(name = "end_date", nullable = false)
    private java.sql.Timestamp endDate;

    @Column(name = "status", nullable = false)
    private int status;

    @Column(name = "topic", length = 128, nullable = false)
    private String topic;
}
