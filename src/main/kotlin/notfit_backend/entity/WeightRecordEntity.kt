
package notfit_backend.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.FetchType
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table
import java.math.BigDecimal
import java.time.Instant
import java.time.LocalDate
import java.util.UUID

@Entity
@Table(name = "weight_records")
open class WeightRecordEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    open var id: UUID? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    open var user: UserEntity? = null

    @Column(name = "weight_kg", nullable = false, precision = 6, scale = 2)
    open var weightKg: BigDecimal = BigDecimal.ZERO

    @Column(name = "recorded_at", nullable = false)
    open var recordedAt: Instant = Instant.now()

    @Column(name = "notes", length = 500)
    open var notes: String? = null

    @Column(name = "created_at", nullable = false, updatable = false)
    open var createdAt: Instant = Instant.now()
}
