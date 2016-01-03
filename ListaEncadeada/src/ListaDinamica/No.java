
package ListaDinamica;

/**
 *
 * @author Anderson
 */
public class No {
    private int info;
    private No prox;

    //METODO CONSTRUTOR VAZIO
    public No{

    }

    public void setInfo(int info) {
        this.info = info;
    }

    public int getInfo() {
        return info;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }

    public No getProx() {
        return prox;
    }
}
