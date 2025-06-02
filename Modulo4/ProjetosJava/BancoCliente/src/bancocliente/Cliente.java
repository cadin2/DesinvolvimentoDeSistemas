/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancocliente;

/**
 *
 * @author ead
 */
public class Cliente {
    private int id;
    private float Saldo;
    private String TipoConta, NumeroConta, EmailCliente, SenhaCliente;

    public Cliente() {
    }

    public Cliente(int id, float Saldo, String TipoConta, String NumeroConta, String EmailCliente, String SenhaCliente) {
        this.id = id;
        this.Saldo = Saldo;
        this.TipoConta = TipoConta;
        this.NumeroConta = NumeroConta;
        this.EmailCliente = EmailCliente;
        this.SenhaCliente = SenhaCliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getSaldo() {
        return Saldo;
    }

    public void setSaldo(float Saldo) {
        this.Saldo = Saldo;
    }

    public String getTipoConta() {
        return TipoConta;
    }

    public void setTipoConta(String TipoConta) {
        this.TipoConta = TipoConta;
    }

    public String getNumeroConta() {
        return NumeroConta;
    }

    public void setNumeroConta(String NumeroConta) {
        this.NumeroConta = NumeroConta;
    }

    public String getEmailCliente() {
        return EmailCliente;
    }

    public void setEmailCliente(String EmailCliente) {
        this.EmailCliente = EmailCliente;
    }

    public String getSenhaCliente() {
        return SenhaCliente;
    }

    public void setSenhaCliente(String SenhaCliente) {
        this.SenhaCliente = SenhaCliente;
    }
    
    
}
