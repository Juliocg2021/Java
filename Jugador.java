public class Jugador extends Personaje {
    //              ^ (Jugador hereda de Personaje)
    //Inserte acá los atributos
        private int numeroBotiquines;
        private double vida;
    
    
    //Inserte acá el método constructor
        public Jugador(String nombre, char sexo, int posicionX, int posicionY, int damage) {
        super(nombre, sexo, posicionX, posicionY, damage);
        this.vida=100;
        this.numeroBotiquines=0;
        
        }
    
    
    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    public void moverDerecha(double derecha) {
        setPosicionX(getPosicionX() + derecha);
    }

    public void moverIzquierda(double izquierda) {
        setPosicionX(getPosicionX() - izquierda);
    }

    public void moverArriba(double arriba) {
        setPosicionY(getPosicionY() + arriba);
    }

    public void moverAbajo(double abajo) {
        setPosicionY(getPosicionY() - abajo);
    }

    public void recogerBotiquin() {
        setNumeroBotiquines(getNumeroBotiquines() + 1);
    }

    public void usarBotiquin() {
        if (getNumeroBotiquines() > 0 ) {
            setNumeroBotiquines(getNumeroBotiquines() - 1);
            setVida(getVida() + 5);
        }
    }

    public void golpear(Enemigo e) { 
        super.golpear(e);
        e.evolucionar();
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

    public int getNumeroBotiquines() {
        return numeroBotiquines;
    }

    public void setNumeroBotiquines(int numeroBotiquines) {
        this.numeroBotiquines = numeroBotiquines;
    }
    
    
}