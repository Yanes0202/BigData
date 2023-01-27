package san.edu.tables;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "FemaleFullName")
public class FemaleFullName {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String fullName;
    private Integer count;
}
