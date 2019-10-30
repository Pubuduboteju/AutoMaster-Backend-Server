package com.ragul.car.Repository;

import com.ragul.car.Model.GeneralUserMessage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GeneralUserMessageRepository extends JpaRepository<GeneralUserMessage,Long> {
   GeneralUserMessage findFirstById(Long id);
}
