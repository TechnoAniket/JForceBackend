package com.Jforce.Attendance.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.Jforce.Attendance.entity.AttendanceRecord;

public interface AttendanceRecordRepository extends JpaRepository<AttendanceRecord, Integer> {
   
			List<AttendanceRecord> findByUsername(String username);

}