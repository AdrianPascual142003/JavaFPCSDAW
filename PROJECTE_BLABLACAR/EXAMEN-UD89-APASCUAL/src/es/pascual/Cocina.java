package es.pascual;

import es.pascual.enums.TipoManipulacion;
import es.pascual.exceptions.IngredienteCaducadoExcepcion;
import es.pascual.exceptions.IngredienteNoValidoExcepcion;
import es.pascual.exceptions.NoHaySuficienteIngredienteException;
import es.pascual.tipo.Ingrediente;
import es.pascual.tipo.IngredienteLiquido;
import es.pascual.tipo.IngredienteSolidoNoPerecedero;
import es.pascual.tipo.IngredienteSolidoPerecedero;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cocina {

    public static void main(String[] args) {

        Despensa despensa = new Despensa();

        parte1A(despensa);

        parte1B(despensa);

        parte2A();

        parte2B();

    }

    private static void parte1A(Despensa despensa) {
        ArrayList<Ingrediente> arrayListIngredientes = new ArrayList<>();

        Ingrediente arroz = new IngredienteSolidoNoPerecedero("Arroz",1.5, LocalDate.of(2023,2,12),1000);
        Ingrediente leche = new IngredienteLiquido("Leche",0.5,LocalDate.of(2023,2,21),1000);
        Ingrediente tomate = new IngredienteSolidoPerecedero("Tomate",0.3,LocalDate.of(2022,12,29),10000);
        Ingrediente limon = new IngredienteSolidoPerecedero("Limon", 1, LocalDate.of(2022,7,23),3000,"Francia");
        Ingrediente aceiteOliva = new IngredienteLiquido("Aceite",4.5,LocalDate.of(2025,10,1),1000);

        arrayListIngredientes.add(arroz);
        arrayListIngredientes.add(leche);
        arrayListIngredientes.add(tomate);
        arrayListIngredientes.add(limon);
        arrayListIngredientes.add(aceiteOliva);

        try {
            for (Ingrediente ingrediente : arrayListIngredientes) {
                despensa.anyadirIngrediente(ingrediente);
                System.out.println("Ingrediente " + ingrediente.getNombre() + " almacenado");
            }
        } catch (IngredienteCaducadoExcepcion e) {
            System.out.println(e.getMessage());
        }
    }

    private static void parte1B(Despensa despensa) {

        ArrayList<Ingrediente> arrayListIngredientes = new ArrayList<>();

        try {
        Ingrediente leche = new IngredienteLiquido("Leche",-2,LocalDate.of(2023,2,21),1000);
        Ingrediente tomate = new IngredienteSolidoPerecedero("tomate",0.3,LocalDate.of(2022,12,29),10000);
        Ingrediente limon = new IngredienteSolidoPerecedero("Limon", 1, LocalDate.of(2025,7,23),3000,null);
        Ingrediente aceiteOliva = new IngredienteLiquido("Aceite",4.5,LocalDate.of(2020,10,1),1000);

        arrayListIngredientes.add(leche);
        arrayListIngredientes.add(tomate);
        arrayListIngredientes.add(limon);
        arrayListIngredientes.add(aceiteOliva);


            for (Ingrediente ingrediente : arrayListIngredientes) {
                despensa.anyadirIngrediente(ingrediente);
                System.out.println("Ingrediente " + ingrediente.getNombre() + " almacenado");
            }
        } catch (IngredienteCaducadoExcepcion | IngredienteNoValidoExcepcion e) {
            System.out.println(e.getMessage());
        }
    }

    private static void parte2A() {
        Receta receta = new Receta(1,"Arroz con leche");

        Receta receta2 = new Receta(2,"Arroz con tomate frito");

        Ingrediente arroz = new IngredienteSolidoNoPerecedero("Arroz",1.5, LocalDate.of(2023,2,12),1000);
        Ingrediente leche = new IngredienteLiquido("Leche",0.5,LocalDate.of(2023,2,21),1000);
        Ingrediente tomate = new IngredienteSolidoPerecedero("Tomate",0.3,LocalDate.of(2022,12,29),10000);
        Ingrediente limon = new IngredienteSolidoPerecedero("Limon", 1, LocalDate.of(2022,7,23),3000,"Francia");
        Ingrediente aceiteOliva = new IngredienteLiquido("Aceite",4.5,LocalDate.of(2025,10,1),1000);

        PasoPreparacion pasoArroz = new PasoPreparacion(TipoManipulacion.PROCESO_MANUAL,arroz,500,5);
        PasoPreparacion pasoLeche = new PasoPreparacion(TipoManipulacion.COCCION_EN_OLLA_ELECTRICA,leche,950,20);

        receta.anyadirPaso(pasoArroz);
        receta.anyadirPaso(pasoLeche);

        System.out.println(receta);

        PasoPreparacion pasoArroz2 = new PasoPreparacion(TipoManipulacion.PROCESO_MANUAL,arroz,500,1);
        PasoPreparacion pasoTomate = new PasoPreparacion(TipoManipulacion.PASADO_POR_PLANCHA,tomate,800,20);
        PasoPreparacion pasoAceite = new PasoPreparacion(TipoManipulacion.COCCION_EN_OLLA_EXPRESS,aceiteOliva,50,5);

        receta2.anyadirPaso(pasoArroz2);
        receta2.anyadirPaso(pasoTomate);
        receta2.anyadirPaso(pasoAceite);

        System.out.println(receta2);

    }

    private static void parte2B() {
        Receta receta = new Receta(1,"Arroz con leche");

        Ingrediente arroz = new IngredienteSolidoNoPerecedero("Arroz",1.5, LocalDate.of(2023,2,12),1000);
        Ingrediente leche = new IngredienteLiquido("Leche",0.5,LocalDate.of(2023,2,21),1000);

        try {
            PasoPreparacion pasoArroz = new PasoPreparacion(TipoManipulacion.PROCESO_MANUAL,arroz,10000,5);
            receta.anyadirPaso(pasoArroz);
        }catch (NoHaySuficienteIngredienteException e) {
            System.out.println(e.getMessage());
        }

        /*
         LA SEGUNDA RECETA NUNCA DARA UNA EXCEPCION PUESTO QUE SE COMPARAN MEDIANTE EL NOMBRE Y EL TIPO DE MANIPULACION, ES DECIR EL NOMBRE ES IGUAL,
         PERO EL TIPO DE MANIPULACION ES DISTINTO
         */

        Receta receta2 = new Receta(2,"Arroz con tomate frito");

        try {
            PasoPreparacion pasoArroz2 = new PasoPreparacion(TipoManipulacion.COCCION_EN_OLLA_ELECTRICA,arroz,500,1);
            PasoPreparacion pasoArroz3 = new PasoPreparacion(TipoManipulacion.COCCION_EN_OLLA_EXPRESS,arroz,500,1);
            receta2.anyadirPaso(pasoArroz2);
            receta2.anyadirPaso(pasoArroz3);
        }catch (NoHaySuficienteIngredienteException e) {
            System.out.println(e.getMessage());
        }

    }

}
