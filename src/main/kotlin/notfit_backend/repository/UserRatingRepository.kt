package notfit_backend.repository

import notfit_backend.entity.UserRatingEntity
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface UserRatingRepository : JpaRepository<UserRatingEntity, UUID> {

    fun findAllByOrderByRatingDesc(): List<UserRatingEntity>

    fun findByUser_Id(userId: UUID): UserRatingEntity?
}