package san.edu.services;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Services<T> {

    List<T> getAllNames();

    List<T> filterByName(String name);

    void saveAll(List<T> list);
}
