package com.ragul.car.Repository;

import com.ragul.car.Model.UserComments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//public interface UserCommentsRepository extends JpaRepository<UserComments, Long> {
//    UserComments findFirstById(Long id);
//    //    @Query("SELECT u FROM User u WHERE u.status = 1")
//    UserComments findUserCommentsByVehicleName(String vehicleName);
//}
@Repository
public interface UserCommentsRepository extends JpaRepository<UserComments,Integer> {
    UserComments findFirstById(Integer id);
}

