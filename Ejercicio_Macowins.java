class Prenda  {
    int precioBase;
    int tipoPrenda;
    int estadoPrenda; // se la define como una de las clases de Estados de las prendas

    method precio(){ 
        return estadoPrenda.calcularPrecio(precioBase); // precio de una prenda luego de considerar su estado 
    }
}


//Estados de las prendas
class Nueva {
    method calcularPrecio(precioBase) = precioBase;
}


class Promocion {
    int precioFijo;
    method calcularPrecio(precioBase) = precioBase - valorFijo;

}

class Liquidacion {
    method calcularPrecio(precioBase) = precioBase/2;
}
//////////////////////////////////////////////////////////







class Ventas {
    int prendas = [];
    int fecha;
    int formaDePago; // se la define como una de las formas de pago

    method subtotal() {} // precio sin considerar la forma de pago, suma el parcial de cada prenda

    method total() = formaDePago.precioFinal(subtotal()); // Precio que paga el cliente

}



 // Metodos de Pago
class Efectivo {
    method precioFinal(subtotal) = subtotal; // el pago en efectivo no produce cambios al precio
}


class Tarjeta {
    int cuotas;
    method precioFinal(subtotal) {
       return recargo(subtotal) + subtotal;
    }

    method recargo(subtotal) = cuotas * coeficienteRecargo + subtotal * 0.01;// calcula el costo adicional de pagar con tarjeta
}
//////////////////////////////////////////////////////////












class Macowins {
    int ventas = []; // incluye a todos los productos que se venden
   // method ventasDeldia(fecha) {}  devuelve la lista de ventas realizadas en el dia
    method gananaciasDelDia(fecha){  // calculo la ganancia de todas las ventas realizadas en el dia
    }
}