package com.example.bookmyshow.Repository;

import java.util.List;

public class UserRepository extends JpaRepository {

    @Query(value="select * from users where age >=:value",nativeQuery=true)

List<User> findUserWithAgeGrater(Integer value);


}
