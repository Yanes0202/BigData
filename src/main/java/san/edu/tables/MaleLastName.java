package san.edu.tables;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="MaleLastName")
@Data
public class MaleLastName {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String lastName;
    private Integer count;
}
