package jihane.malek.patientsmvc;

import jihane.malek.patientsmvc.entities.Patient;
import jihane.malek.patientsmvc.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class PatientsMvcApplication {

    public static void main(String[] args) {

        SpringApplication.run(PatientsMvcApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository ) {
        return args -> {
            patientRepository.save(
                    new Patient(null,"Hassan",new Date(),false,122));
            patientRepository.save(
                    new Patient(null,"Mohammed",new Date(),true,321));
            patientRepository.save(
                    new Patient(null,"Yasmine",new Date(),true,635));
            patientRepository.save(
                    new Patient(null,"Hanae",new Date(),false,320));


        };
    }

}