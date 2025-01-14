package by.titanic.server.models;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashMap;

@Entity
@Table(name = "proposal")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Proposal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private Integer organization_id;

    //Предлагаю добавить столбец organization_id в эту сущность, чтобы ссылаться на конкретную организацию, от которой поступает предложение
    @ManyToOne
    @JoinColumn(name = "organization_id", referencedColumnName = "id")
    private Organization organization;

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
    private String status;

    @Column(name = "topic", length = 128, nullable = false)
    private String topic;

    public HashMap<String, String> getMapOfOptions(){
        HashMap<String, String> options = new HashMap<>();
        options.put("first_option", this.firstOption);
        options.put("second_option", this.secondOption);
        options.put("third_option", this.thirdOption);
        return options;
    }
}
