package san.edu.tables;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "MaleLastName")
public class MaleLastName {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String lastName;
    private Integer count;
}
