package san.edu.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import san.edu.repositories.MaleLastNameRepository;
import san.edu.tables.MaleLastName;

import java.util.List;

@Service
@Qualifier("MaleLastNameService")
public class MaleLastNameService implements Services<MaleLastName> {

    @Autowired
    public MaleLastNameRepository maleLastNameRepository;

    @Override
    public List<MaleLastName> getAllNames() {
        return (List<MaleLastName>) maleLastNameRepository.findAll();
    }

    @Override
    public List<MaleLastName> filterByName(String lastName) {
        return maleLastNameRepository.findByLastNameLike(lastName);
    }

    @Override
    public void saveAll(List<MaleLastName> list) {
        maleLastNameRepository.saveAll(list);
    }

}
