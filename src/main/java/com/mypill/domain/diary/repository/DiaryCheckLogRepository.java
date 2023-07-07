package com.mypill.domain.diary.repository;

import com.mypill.domain.diary.entity.DiaryCheckLog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;


public interface DiaryCheckLogRepository extends JpaRepository<DiaryCheckLog,Long> {
    List<DiaryCheckLog> findByMemberId (Long memberId);
    List<DiaryCheckLog> findByCheckDate (LocalDate date);
}
