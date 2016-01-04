public class No {
	private int info;
	private No prox;

	public No(){}

	public void setInfo(int info){
		this.info = info;
	}

	public int getInfo(){
		return this.info;
	}

	public void setProx(No prox){
		this.prox = prox;
	}

	public No getProx(){
		return this.prox;
	}
}