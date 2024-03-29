/*Crear la clase Perecedero, que va a tener un atributo llamado diasPorCaducar de tipo int,
al igual que para el producto, definir setters, getters, constructor que reciba todos los atributos por
parámetro y el método toString(). Esta clase debe heredar de Producto y sobreescribir el método calcular(),
el cual tiene que hacer lo mismo que la clase Producto (multiplicar el precio por la cantidad de productos)
y adicionalmente, reducir el precio según los diasPorCaducar:

- Si le resta un día (1) para caducar, se reducirá 4 veces el precio final.
- Si le restan dos días (2) para caducar, se reducirá 3 veces el precio final.
- Si le restan 3 días (3) para caducar, se reducirá la mitad de su precio final.*/
public class Perecedero extends Producto {
    int diasPorCaducar;
    public int getDiasPorCaducar() {
        return diasPorCaducar;
    }

    public void setDiasPorCaducar(int diasPorCaducar) {
        this.diasPorCaducar = diasPorCaducar;
    }

    public Perecedero(String nombre, double precio, int diasPorCaducar) {
        super(nombre, precio);
        this.diasPorCaducar = diasPorCaducar;
    }

    @Override
    public String toString() {
        return "Perecedero{" +
                "diasPorCaducar=" + diasPorCaducar +
                '}';
    }

    @Override
    public double calcular(int cantidadDeProductos) {
        double calculoParcial = super.calcular(cantidadDeProductos);
        return switch (this.diasPorCaducar) {
            case 1 -> calculoParcial / 4;
            case 2 -> calculoParcial / 3;
            case 3 -> calculoParcial / 2;
            default -> calculoParcial;
        };
    }
}
