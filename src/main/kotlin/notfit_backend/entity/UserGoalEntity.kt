
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
import java.time.LocalDate
import java.util.UUID

@Entity
@Table(name = "user_goals")
open class UserGoalEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    open var id: UUID? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    open var user: UserEntity? = null

    @Column(name = "goal_type", nullable = false, length = 30)
    open var goalType: String = ""

    @Column(name = "target_value", precision = 10, scale = 2)
    open var targetValue: BigDecimal? = null

    @Column(name = "current_value", precision = 10, scale = 2)
    open var currentValue: BigDecimal? = null

    @Column(name = "unit", length = 20)
    open var unit: String? = null

    @Column(name = "start_date", nullable = false)
    open var startDate: LocalDate = LocalDate.now()

    @Column(name = "target_date")
    open var targetDate: LocalDate? = null

    @Column(name = "is_completed", nullable = false)
    open var isCompleted: Boolean = false

    @Column(name = "created_at", nullable = false, updatable = false)
    open var createdAt: Instant = Instant.now()

    @Column(name = "updated_at", nullable = false)
    open var updatedAt: Instant = Instant.now()

    @PreUpdate
    fun updateTimestamp() {
        updatedAt = Instant.now()
    }
}
