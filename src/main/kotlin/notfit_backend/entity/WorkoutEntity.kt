
package notfit_backend.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.FetchType
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.PreUpdate
import jakarta.persistence.Table
import java.math.BigDecimal
import java.time.Instant
import java.util.UUID

@Entity
@Table(name = "workouts")
open class WorkoutEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    open var id: UUID? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    open var user: UserEntity? = null

    @Column(name = "name", nullable = false, length = 150)
    open var name: String = ""

    @Column(name = "workout_type", length = 30)
    open var workoutType: String? = null

    @Column(name = "started_at", nullable = false)
    open var startedAt: Instant = Instant.now()

    @Column(name = "ended_at")
    open var endedAt: Instant? = null

    @Column(name = "duration_minutes")
    open var durationMinutes: Int? = null

    @Column(name = "calories_burned", precision = 8, scale = 2)
    open var caloriesBurned: BigDecimal? = null

    @Column(name = "notes", length = 1000)
    open var notes: String? = null

    @Column(name = "created_at", nullable = false, updatable = false)
    open var createdAt: Instant = Instant.now()

    @Column(name = "updated_at", nullable = false)
    open var updatedAt: Instant = Instant.now()

    @PreUpdate
    fun updateTimestamp() {
        updatedAt = Instant.now()
    }
}
