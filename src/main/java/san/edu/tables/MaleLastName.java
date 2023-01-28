package san.edu.tables;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Table;

@EqualsAndHashCode(callSuper = true)
@Data
@Table(name = "MaleLastName")
public class MaleLastName extends BaseTable{
    private String lastName;
}
