public class Pilha {
   public No topo;
   
   public Pilha criaPilha(Pilha p){
       p.topo = null;
       return p;
   }
   
   public Pilha pilha_push(int info, Pilha p){
       No novo = new No();
       novo.setInfo(info);
       novo.setProx(p.topo);
       p.topo = novo;
       return p;
   }
   
   public Pilha pilha_pop(Pilha p){
       No pont;
       pont = p.topo;
       p.topo = p.topo.getProx();
       return p;
   }
   
   public void imprimePilha(Pilha p){
       No pont;
       for(pont = p.topo;pont != null; pont = pont.getProx()){
           System.out.println(pont.getInfo());
       }
   }
}
