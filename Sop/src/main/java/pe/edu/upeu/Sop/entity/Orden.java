package pe.edu.upeu.Sop.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name="ordens")
public class Orden {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name = "fecha_orden")    
    @Temporal(TemporalType.DATE) 
    private Date fecha_orden;

    @Column(name = "fecha_solicita")    
    @Temporal(TemporalType.DATE) 
    private Date fecha_solicita;

    @Column(name = "estado")
    private char estado; 

    @ManyToOne
    @JoinColumn(name = "almacen_id", nullable = false)
    private Almacen almacen;

    @ManyToOne
    @JoinColumn(name = "proveedor_id", nullable = false)
    private Proveedor proveedor;

    @ManyToOne
    @JoinColumn(name = "tipo_Orden_id", nullable = false)
    private Tipo_Orden tipo_Orden;

    @ManyToOne
    @JoinColumn(name = "forma_Pago_id", nullable = false)
    private Forma_Pago forma_pago; 
}












