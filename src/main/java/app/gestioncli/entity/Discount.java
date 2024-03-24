package app.gestioncli.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER")
public class Discount {
    @Id
    @Column(name = "CODE", length = 1)
    private char code;

    @Column(name = "RATE", precision = 4, scale = 2)
    private double rate;

    public char getCode() {
        return code;
    }

    public double getRate() {
        return rate;
    }

    public void setCode(char code) {
        this.code = code;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
    
}
