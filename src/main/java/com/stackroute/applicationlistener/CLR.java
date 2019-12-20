package com.stackroute.applicationlistener;

import com.stackroute.domain.Music;
import com.stackroute.repository.UserMongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CLR implements CommandLineRunner {

    private UserMongoRepository musicRepository;
    @Autowired
    public void CLR(UserMongoRepository musicRepository) {
        this.musicRepository = musicRepository;
    }

    @Override
    public void run(String... args) throws Exception {
       musicRepository.save(new Music(12, "Sone Lagde", "From Battle Studies"));
    }
}
