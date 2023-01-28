package san.edu.tables;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Table;

@EqualsAndHashCode(callSuper = true)
@Data
@Table(name = "MaleFullName")
public class MaleFullName extends BaseTable{
    private String fullName;
}