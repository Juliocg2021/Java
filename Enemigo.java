public class Enemigo extends Personaje {
    //              ^ (Enemigo hereda de Personaje)
    //Inserte acá los atributos
        private int evolucionesAplicadas;
        private int resistencia;
        private double vida;
    
    
    //Inserte acá el método constructor
        public Enemigo(String nombre, char sexo, int posicionX, int posicionY, int damage) {
        super(nombre, sexo, posicionX, posicionY, damage);
        this.evolucionesAplicadas = 0;
        this.resistencia = 1;
        this.vida=100;
        }
    
    
    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
        public void evolucionar() {
            
            if (getVida() <= 30 && getEvolucionesAplicadas() == 0 ) {
                setDamage(getDamage() + 20);
                setEvolucionesAplicadas(getEvolucionesAplicadas() + 1);
            }
            if (getVida() <= 10 && getEvolucionesAplicadas() == 1) {
                setResistencia(getResistencia()+1);
                
                setEvolucionesAplicadas(getEvolucionesAplicadas() + 1);
            }
        }

        public void recibirImpacto(int i) {
            i =i/getResistencia();
            
            super.recibirImpacto(i);
        }

    //Inserte acá los SETTERS Y GETTERS
        @Override
    public double getVida() {
        return vida;
    }

    @Override
    public void setVida(double vida) {
        this.vida = vida;
    }

    public int getEvolucionesAplicadas() {
        return evolucionesAplicadas;
    }

    public void setEvolucionesAplicadas(int evolucionesAplicadas) {
        this.evolucionesAplicadas = evolucionesAplicadas;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }
}