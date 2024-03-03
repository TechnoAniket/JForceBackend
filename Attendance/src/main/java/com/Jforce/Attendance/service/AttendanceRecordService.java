package com.Jforce.Attendance.service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Jforce.Attendance.entity.AttendanceRecord;
import com.Jforce.Attendance.entity.User;
import com.Jforce.Attendance.repository.AttendanceRecordRepository;
import com.Jforce.Attendance.repository.UserRepository;


@Service
public class AttendanceRecordService {

    @Autowired
    private AttendanceRecordRepository attendanceRecordRepository;

    @Autowired
    private UserRepository userRepository;

   

    public AttendanceRecord signInandOut(AttendanceRecord attendanceRecord) {
       return attendanceRecordRepository.save(attendanceRecord);
    }



	public List<AttendanceRecord> getAttendanceByUserName(String username) {

		return attendanceRecordRepository.findByUsername(username);
	}

    
}
