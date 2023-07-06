package com.mypill.domain.diary.repository;

import com.mypill.domain.diary.entity.DiaryCheckLog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DiaryCheckLogRepository extends JpaRepository<DiaryCheckLog,Long> {
    Optional<DiaryCheckLog> findByDeleteDateNullAndId(long diaryId);
}
