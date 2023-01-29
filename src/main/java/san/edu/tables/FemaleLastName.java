package san.edu.tables;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "FemaleLastName")
public class FemaleLastName {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String lastName;
    private Integer count;
}
