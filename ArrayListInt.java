import java.util.Iterator;
import java.util.Vector;
/**
 * Write a description of class ArrayListInt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayListInt
{
    //array que almacena una coleccion de numeros enteros
    private int [] arrayList ;

    /**
     * Constructor for objects of class ArrayListInt
     */
    public ArrayListInt()
    {
        arrayList = new int[0];   //se crea un array de tamaño 0 que luego se redimensionara
    }

    
    /**
    /**
     * Metodo que añade un elemento a la coleccion al final de la misma
     */
    public void add(int elemento)
    {

        //creamos un array temporal con un tamaño igual al del array inicial aumentado en 1
        int[] temp = new int[arrayList.length + 1];
        //almacenamos el elemento pasado por paramentro en la ultima posicion
        temp[temp.length-1] = elemento; 
        //almacenamos los objetos existentes en el array original en el temporal
        for(int i=0; i<arrayList.length;i++)
        {
            temp[i] = arrayList[i];
        }
        arrayList=temp;
    }

    /**
     * Metodo que añade un elemento a la coleccion en la posicion especificada por parametro
     * si no existe ese indice no hace nada
     */
    public void add(int index,int elemento)
    {
        if((index<=arrayList.length) && (index>=0))    //si el indice pasado por parametro es un valor adecuado
        {
            //creamos un array temporal con un tamaño igual al del array inicial aumentado en 1
            int[] temp = new int[arrayList.length + 1];
            int i = 0;      //contador para indicar la posicion de los objetos en el array original
            for(int cont= 0; cont< temp.length; cont++)    //se repite el bucle mientras no se supere el tamaño de la coleccion
            {

                if(cont== index)   //si el indice pasado por parametro coincide con alguno existente en la coleccion
                {
                    temp[cont] = elemento;    //almacenamos el objeto en esa posicion

                }
                else  //sino coincide almacenamos el objeto del array original en el array temporal 
                {
                    temp[cont] = arrayList[i]; 
                    i++;     //aumentamos el indice del array original
                }
                
            }
            arrayList = temp;
        }
    }

    /**
     * Metodo que vacia la coleccion
     */
    public void clear()
    { 
        arrayList = new int[0];
    }
    
    /**
     * Metodo que devuelve true si contiene en la coleccion el elemento pasado como parametro
     */
    public boolean contains(int elemento)
    {
        boolean found = false;    //se inicializa a falso porque no se ha encontrado el elemento
        int cont = 0;
        while((cont<arrayList.length) && (!found))  //se recorre el bucle mientras no se supere el tamaño de coleccion y no se encuentre el objeto
        {
            if(arrayList[cont] == elemento) //si un objeto de la coleccion coincide con el parametro
            {
                found = true;    //se encuentra el objeto
            }
            cont++;
        }
        return found;
    }
    
    /**
     * Metodo que devuelve el elemento existente en la posicion indicada
     * si el valor del parametro no es valido devuelve -1
     */
    public int get(int index)
    {
        int elemento = -1;
        if((index<arrayList.length) && (index>=0))   //se hace un control de rango para ver si el valor del parametro es el adecuado
        {
            boolean found = false;  //se inicializa en false porque se considera que no se ha encontrado el objeto
            int cont = 0;
            while((cont<arrayList.length) && (!found))   //mientras no se encuentre el objeto y no se recorra toda la coleccion se repite el ciclo
            {
                if(cont== index)    //si el valor del parametro coincide con la posicion de la coleccion
                {
                    elemento = arrayList[cont];   //almacenamos el objeto correspondiente a esa posicion
                    found = true;
                }
                cont++;
            }
        }
        return elemento;
    }
}
