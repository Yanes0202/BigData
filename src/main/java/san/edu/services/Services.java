package san.edu.services;

import org.springframework.stereotype.Service;
import san.edu.tables.BaseTable;

import java.util.List;

@Service
public interface Services {

    List<? extends BaseTable> getAllNames();

    List<? extends BaseTable> filterByName(String name);


}
