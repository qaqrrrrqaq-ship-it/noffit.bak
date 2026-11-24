package notfit_backend.repository

import notfit_backend.entity.UserAchievementEntity
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface UserAchievementRepository : JpaRepository<UserAchievementEntity, UUID> {

    fun findAllByUser_Id(userId: UUID): List<UserAchievementEntity>

    fun existsByUser_IdAndAchievement_Id(userId: UUID, achievementId: UUID)
        : Boolean
}