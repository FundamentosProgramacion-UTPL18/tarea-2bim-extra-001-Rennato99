package fp_tarea01;

/**
 * @author Renato
 */
public class FP_TAREA01 {

    public static void main(String[] args) {
        

        String [] meses = {"Agosto", "Octubre","Diciembre"};
        String [] sucursales = {"sucursal 1", "sucursal 2", "sucursal 3", "sucursal 4"};
        double [] ventas_mes_1 = {4500.2, 5500.2, 6500.2, 2500.1};
        double [] ventas_mes_2 = {1500.2, 2500.2, 3500.2, 1500.1};
        double [] ventas_mes_3 = {2300.2, 1200.2, 4700.2, 3200.1};

        double [] venta_total_sucursal = new double[4];
        double [] venta_promedio_sucursal = new double[4];
        
        double total = 0; // Para presentar al final el total de ventas de todas las sucursales
        
        
        // Calculo del arreglo para el total
        for (int contador = 0; contador < sucursales.length; contador ++) { // Para cada sucursal se calcula el total de ventas
            venta_total_sucursal[contador] = ventas_mes_1[contador]+ventas_mes_2[contador]+ventas_mes_3[contador]; 
        } // Fin for
        
        // Calculo del arreglo para el promedio
        for (int contador = 0; contador < sucursales.length; contador ++) { // Para cada sucursal se calcula su promedio de ventas
            venta_promedio_sucursal[contador] = venta_total_sucursal[contador] / meses.length; 
        } // Fin for
        
        // Calculo totales de ventas en todas las sucursales
        for (int contador = 0; contador < sucursales.length; contador ++) { // Se van sumando las ventas de cada sucursal y se guardan en la variable total
            total = total + venta_total_sucursal[contador]; // Para presentar al final el total de ventas
        } // Fin for
        
        // Encabezado
        System.out.printf("Reporte\n\n\n\t");
        
        for (int contador = 0; contador < meses.length; contador ++) { // Se presenta en columna todos los encabezados
            System.out.printf("\t\t%s", meses[contador]); 
        } // Fin for
        
        System.out.printf("\tTotal\t\tPromedio\n\n"); // Luego las columnas de TOTAL y PROMEDIO
        
        // Reporte
        for (int contador = 0; contador < sucursales.length; contador ++) { // Para cada sucursal se imprimen sus datos
            System.out.printf("%s\t\t%.1f\t\t%.1f\t\t%.1f\t\t%.1f\t\t%.1f\n", sucursales[contador],
                    ventas_mes_1[contador], ventas_mes_2[contador], ventas_mes_3[contador], venta_total_sucursal[contador], 
                    venta_promedio_sucursal[contador]);   
        } // Fin for
        
        System.out.printf("\n\nTotales de ventas de todas la sucursales es: %.1f\n\n", total); 
       

    }
    
}
