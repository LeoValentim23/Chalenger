package Classes;

public class Autorizador_Porto {

        private static final double PESO_MAXIMO_SUSTENTAVEL = 100.0;
        private double pesoAtual = 0.0;

        public void levantar(double peso) {
            if (peso > PESO_MAXIMO_SUSTENTAVEL ) {
                throw new IllegalStateException(
                        String.format("Não é possível levantar um peso maior do que %s kg.", PESO_MAXIMO_SUSTENTAVEL));
            }

            pesoAtual = peso;
        }

        public void baixar() {
            pesoAtual = 0.0;
        }

        public double getPesoAtual() {
            return pesoAtual;
        }

    }

