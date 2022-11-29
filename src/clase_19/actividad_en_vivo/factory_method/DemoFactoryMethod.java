package clase_19.actividad_en_vivo.factory_method;

import clase_19.actividad_en_vivo.factory_method.empleados.Empleado;
import clase_19.actividad_en_vivo.factory_method.empleados.EmpleadoContratadoPorHora;
import clase_19.actividad_en_vivo.factory_method.empleados.EmpleadoRelacionDeDependencia;

import java.util.ArrayList;
import java.util.Arrays;

public class DemoFactoryMethod {
    public static void main(String[] args) {

        Empresa dhEmpresa = new Empresa("DHTech");
        EmpleadoFactoryMethod empleadoFactoryMethod = new EmpleadoFactoryMethod();

        EmpleadoRelacionDeDependencia empleadoRD1 = (EmpleadoRelacionDeDependencia) empleadoFactoryMethod.crearEmpleado("EMP-RD");
        empleadoRD1.setNombre("Pablo");
        empleadoRD1.setApellido("Medina");
        empleadoRD1.setLegajo(1150);
        System.out.println(empleadoRD1.toString());

        EmpleadoContratadoPorHora empleadoPH2 = (EmpleadoContratadoPorHora) empleadoFactoryMethod.crearEmpleado("EMP-PH");
        empleadoPH2.setNombre("Lorena");
        empleadoPH2.setApellido("Medina");
        empleadoPH2.setCantidadDeHorasTrabajadasPorMes(50);
        System.out.println(empleadoPH2.toString());

        EmpleadoContratadoPorHora empleadoPH3 = (EmpleadoContratadoPorHora) empleadoFactoryMethod.crearEmpleado("EMP-PH");
        empleadoPH3.setNombre("Alejandra");
        empleadoPH3.setApellido("Oropel");
        empleadoPH3.setLegajo(1152);
        empleadoPH3.setCantidadDeHorasTrabajadasPorMes(100);
        System.out.println(empleadoPH3.toString());

        EmpleadoRelacionDeDependencia empleadoRD2 = (EmpleadoRelacionDeDependencia) empleadoFactoryMethod.crearEmpleado("EMP-RD");
        empleadoRD2.setNombre("Mario");
        empleadoRD2.setApellido("Pereyra");
        empleadoRD2.setLegajo(1153);
        empleadoRD2.setSalarioBruto(1200.00);
        System.out.println(empleadoRD2.toString());

        dhEmpresa.setEmpleados(new ArrayList<Empleado>(Arrays.asList(empleadoRD1, empleadoPH2, empleadoPH3, empleadoRD2)));

        System.out.println("Total pagado de sueldos: USD" + dhEmpresa.calcularTotalPagadoDeSalarios());
    }
}
