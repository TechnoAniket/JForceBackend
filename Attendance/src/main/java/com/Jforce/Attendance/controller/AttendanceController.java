package com.Jforce.Attendance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Jforce.Attendance.entity.AttendanceRecord;
import com.Jforce.Attendance.service.AttendanceRecordService;

@RestController
@RequestMapping("/attendance")
public class AttendanceController {

    @Autowired
    private AttendanceRecordService attendanceRecordService;
   
    @GetMapping("/attendanceRecordByUserName/{username}")
    public List<AttendanceRecord> getAttendanceByUserName(@PathVariable String username){
    	return attendanceRecordService.getAttendanceByUserName(username);
    }
    
    @PostMapping("/signin")
    public AttendanceRecord signIn(@RequestBody AttendanceRecord attendanceRecord) {
    	return attendanceRecordService.signInandOut(attendanceRecord);
    }
    
    @PostMapping("/signout")
    public AttendanceRecord signOut(@RequestBody AttendanceRecord attendanceRecord) {
    	return attendanceRecordService.signInandOut(attendanceRecord);
    }


}
