package MS.StudentPersonalDetails.service;

import MS.StudentPersonalDetails.model.PersonalDetails;
import MS.StudentPersonalDetails.repository.PersonalDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    private PersonalDetailsRepository repository;




    public List<PersonalDetails> getAllPD() {
        return repository.findAll();
    }

    public Optional<PersonalDetails> getById(Integer PDID) {
        return repository.findById(PDID);
    }
}
