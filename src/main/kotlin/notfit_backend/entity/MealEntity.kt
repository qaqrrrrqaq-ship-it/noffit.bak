
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
import java.time.Instant
import java.time.LocalDate
import java.util.UUID

@Entity
@Table(name = "meals")
open class MealEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    open var id: UUID? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    open var user: UserEntity? = null

    @Column(name = "meal_date", nullable = false)
    open var mealDate: LocalDate = LocalDate.now()

    @Column(name = "meal_type", nullable = false, length = 20)
    open var mealType: String = "BREAKFAST"

    @Column(name = "title", length = 150)
    open var title: String? = null

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
