package com.ragul.car.Repository;

import com.ragul.car.Model.ServiceAppointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceAppointmentRepository extends JpaRepository<ServiceAppointment,Long> {
    ServiceAppointment findFirstById(Long id);
}
