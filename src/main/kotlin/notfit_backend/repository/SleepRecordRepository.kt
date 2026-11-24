package notfit_backend.repository

import notfit_backend.entity.SleepRecordEntity
import org.springframework.data.jpa.repository.JpaRepository
import java.time.LocalDate
import java.util.UUID

interface SleepRecordRepository : JpaRepository<SleepRecordEntity, UUID> {

    fun findAllByUser_IdAndSleepDateBetweenOrderBySleepDateDesc(
        userId: UUID,
        startDate: LocalDate,
        endDate: LocalDate
    ): List<SleepRecordEntity>
}