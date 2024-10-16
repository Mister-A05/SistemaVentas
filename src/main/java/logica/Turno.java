
package logica;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Entity 
public class Turno implements Serializable {
    
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id_Turno;
    @Temporal(TemporalType.DATE)    
    private Date fecha_turno;
    private String hora_turno;
    private String afeccion;
    @ManyToOne
    @JoinColumn(name="id_turno")
    private Odontologo odonto;
    @ManyToOne
    @JoinColumn(name="id_turno2")
    private Paciente pacien;

    public Turno() {
    }

    public Turno(int id_Turno, Date fecha_turno, String hora_turno, String afeccion) {
        this.id_Turno = id_Turno;
        this.fecha_turno = fecha_turno;
        this.hora_turno = hora_turno;
        this.afeccion = afeccion;
    }

    public int getId_Turno() {
        return id_Turno;
    }

    public void setId_Turno(int id_Turno) {
        this.id_Turno = id_Turno;
    }

    public Date getFecha_turno() {
        return fecha_turno;
    }

    public void setFecha_turno(Date fecha_turno) {
        this.fecha_turno = fecha_turno;
    }

    public String getHora_turno() {
        return hora_turno;
    }

    public void setHora_turno(String hora_turno) {
        this.hora_turno = hora_turno;
    }

    public String getAfeccion() {
        return afeccion;
    }

    public void setAfeccion(String afeccion) {
        this.afeccion = afeccion;
    }
    
    
    

}
