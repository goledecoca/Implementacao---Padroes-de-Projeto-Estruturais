package br.edu.fapi.aves;

public class PeruAdapter implements Pato {
	private Peru peru;

    public PeruAdapter( Peru peru ){
        this.peru = peru;
    }
	
	
	@Override
	    public void grasnar() {
	        peru.soar(); /* MÉTODO DE PERU SENDO UTILIZADO DE FORMA ADAPTADA */
	    }

	    @Override
	    public void voar() {
	        peru.voar(); /* IGUALMENTE AQUI */
	        System.out.println("voar,voar,voar,voar");
	    }
}

