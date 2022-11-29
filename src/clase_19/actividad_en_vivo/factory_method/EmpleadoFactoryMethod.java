package clase_19.actividad_en_vivo.factory_method;

import clase_19.actividad_en_vivo.factory_method.empleados.Empleado;
import clase_19.actividad_en_vivo.factory_method.empleados.EmpleadoContratadoPorHora;
import clase_19.actividad_en_vivo.factory_method.empleados.EmpleadoRelacionDeDependencia;

public class EmpleadoFactoryMethod {

    // Métodos públicos responsables de crear objetos
    public Empleado crearEmpleado(String tipo) {
        switch (tipo.toUpperCase()){
            case "EMP-RD":
                return new EmpleadoRelacionDeDependencia(1000.0);
            case "EMP-PH":
                return new EmpleadoContratadoPorHora(7.0);
        }

        return null;
    }
}
