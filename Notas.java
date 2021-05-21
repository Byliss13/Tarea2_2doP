import java.util.ArrayList;

public class Notas
{
    int estudiantes;
    ArrayList<Integer> notasEstudiantes;
    int indice = 0;
    Notas(int estudiantes){
        this.estudiantes = estudiantes;
        notasEstudiantes = new ArrayList<Integer>();
    }
    
    void addNotas(int nota){
        if(indice<estudiantes){
            notasEstudiantes.add(nota);
            indice++;
        }else{
            System.out.println("Ya no se pueden añadir mas notas,limite de estudiantes alcanzado");
        }
    }
    
    double promedio(){
        double promedio = 0;
        int contador = 0;
        for(int indice = 0; indice < notasEstudiantes.size();indice++){
            promedio = promedio + notasEstudiantes.get(indice);
            contador++;
        }
        promedio= promedio/contador;
        return promedio;
    }
    
    double promedioAprobados(){
        double promedio = 0;
        int contador = 0;
        for(int indice = 0; indice < notasEstudiantes.size();indice++){
            if(notasEstudiantes.get(indice) >= 51){
                promedio = promedio + notasEstudiantes.get(indice);
                contador++;
            }
        }
        promedio= promedio/contador;
        return promedio;
    }
    
    int cantidadReprobados(){
        int reprobados = 0;
        for(int contador = 0; contador < notasEstudiantes.size();contador++){
            if(notasEstudiantes.get(contador) < 51){
                reprobados++;
            }
        }
        return reprobados;
    }
    
    int cantidadAprobados(){
        int aprobados = 0;
        for(int contador = 0; contador < notasEstudiantes.size();contador++){
            if(notasEstudiantes.get(contador) >= 51){
                aprobados++;
            }
        }
        return aprobados;
    }
    
    double notaMasAlta(){
        double notaAlta = 0;
        for(int contador = 0; contador < notasEstudiantes.size();contador++){
            if(notasEstudiantes.get(contador) > notaAlta){
                notaAlta = notasEstudiantes.get(contador);
            }
        }
        return notaAlta;
    }
}
