
package notfit_backend.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.math.BigDecimal
import java.time.Instant
import java.util.UUID

@Entity
@Table(name = "food_products")
open class FoodProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    open var id: UUID? = null

    @Column(name = "name", nullable = false, length = 200)
    open var name: String = ""

    @Column(name = "brand", length = 150)
    open var brand: String? = null

    @Column(name = "calories_per_100g", nullable = false, precision = 8, scale = 2)
    open var caloriesPer100g: BigDecimal = BigDecimal.ZERO

    @Column(name = "protein_per_100g", nullable = false, precision = 8, scale = 2)
    open var proteinPer100g: BigDecimal = BigDecimal.ZERO

    @Column(name = "fat_per_100g", nullable = false, precision = 8, scale = 2)
    open var fatPer100g: BigDecimal = BigDecimal.ZERO

    @Column(name = "carbs_per_100g", nullable = false, precision = 8, scale = 2)
    open var carbsPer100g: BigDecimal = BigDecimal.ZERO

    @Column(name = "fiber_per_100g", precision = 8, scale = 2)
    open var fiberPer100g: BigDecimal? = null

    @Column(name = "is_verified", nullable = false)
    open var isVerified: Boolean = false

    @Column(name = "created_at", nullable = false, updatable = false)
    open var createdAt: Instant = Instant.now()
}
