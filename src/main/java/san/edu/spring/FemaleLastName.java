package san.edu.spring;

import lombok.Data;

import javax.persistence.*;

@Table(name = "last")
@Entity
@Data
public class FemaleLastName {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String lastName;
    private Integer count;
}
