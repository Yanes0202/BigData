package san.edu.tables;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Table;

@EqualsAndHashCode(callSuper = true)
@Data
@Table(name = "FemaleFullName")
public class FemaleFullName extends BaseTable {
    private String fullName;
}
