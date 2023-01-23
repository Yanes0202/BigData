package san.edu.tables;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "FemaleLastName")
@Data
public class FemaleLastName {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String lastName;
    private Integer count;
}
