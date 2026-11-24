
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
import java.time.Instant
import java.util.UUID

@Entity
@Table(name = "water_records")
open class WaterRecordEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    open var id: UUID? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    open var user: UserEntity? = null

    @Column(name = "amount_ml", nullable = false)
    open var amountMl: Int = 0

    @Column(name = "recorded_at", nullable = false)
    open var recordedAt: Instant = Instant.now()

    @Column(name = "created_at", nullable = false, updatable = false)
    open var createdAt: Instant = Instant.now()
}
