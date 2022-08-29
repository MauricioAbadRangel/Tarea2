
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mau
 * @param <T>
 */
public class ArregloADT <T> {

    public static void main(String[] args) {
        Arreglos_ADT febrero = new Arreglos_ADT(5);
        febrero.setItem("Esdad", 0);
        febrero.setItem(1, 1);
        febrero.setItem("_", 2);
        febrero.setItem(333333, 3);

        for (int p = 0; p < febrero.getLenght(); p++) {
            System.out.println("El elemento que se encuentra en el índice "
                    + p + " es: " + febrero.getItem(p));
        }
    }

    int tamano; //  tamaño 
    private final ArrayList<T> datos;

    public ArregloADT(int tamano) { //Constructor
        this.datos = new ArrayList<>(tamano);
        //datos = new ArrayList();
        for (int j = 0; j < tamano; j++) {
            datos.add(null);
        }
    }

    public T getItem(int Indice) { //Getter
        if (Indice >= 0 && Indice < this.tamano) {
            return datos.get(Indice);
        }
        return null;
    }

    public void setItem(T Elemento, int Indice) { //Setter
        if (Indice >= 0 && Indice < this.tamano) {
            datos.set(Indice, Elemento);
        }
    }

    public int getLenght() { //Get Lenght
        return datos.size();
    }

    public void clear(T Elemento) { //Clear
        for (int i = 0; i < datos.size(); i++) {
            datos.set(i, Elemento);
        }
    }

}

