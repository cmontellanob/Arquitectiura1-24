/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cochesturbo;

/**
 *
 * @author Carlos
 */
public class Coche {
    private Marca marca;
    private int modelo;
    private String placa;
    private Color color;
    private int cilindrada;

    public Coche(Marca marca, int modelo, String placa, Color color, int cilindrada) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.color = color;
        this.cilindrada = cilindrada;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    
    public void GuardarBd(){
         
    }
}
