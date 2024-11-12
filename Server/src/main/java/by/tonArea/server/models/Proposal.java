package by.tonArea.server.models;

import jakarta.persistence.*;
import lombok.*;

import javax.validation.constraints.Pattern;
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
    @Pattern(regexp = "[01]", message = "Status must be either '0' - pending or '1' - active or '2' - end")
    private String status;

    @Column(name = "topic", length = 128, nullable = false)
    private String topic;

    @Column(name = "description", length = 1024, nullable = false)
    private String description;

    public HashMap<String, String> getMapOfOptions(){
        HashMap<String, String> options = new HashMap<>();
        options.put("first_option", this.firstOption);
        options.put("second_option", this.secondOption);
        options.put("third_option", this.thirdOption);
        return options;
    }

    public void setMapOfOptions(HashMap<String, String> options) {
        if (options.containsKey("first_option")) {
            this.firstOption = options.get("first_option");
        }
        if (options.containsKey("second_option")) {
            this.secondOption = options.get("second_option");
        }
        if (options.containsKey("third_option")) {
            this.thirdOption = options.get("third_option");
        }
    }
}
