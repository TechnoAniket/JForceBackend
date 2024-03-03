package com.Jforce.Attendance.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Jforce.Attendance.entity.AttendanceRecord;
import com.Jforce.Attendance.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByUsername(String username);

	
}
