package san.edu.tables;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "MaleFullName")
public class MaleFullName {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String fullName;
    private Integer count;
}