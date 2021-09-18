public class Pilha {

    public Object[] pilha;
    public int posicaoPilha;

    public Pilha() {
        this.posicaoPilha = -1;
        this.pilha = new Object[1000];
    }

    public boolean empty() {
        if (this.posicaoPilha == -1) {
            return true;
        }
        return false;
    }

    public int length() {
        if (this.pilhaVazia()) {
            return 0;
        }
        return this.posicaoPilha + 1;
    }

    public Object last() {
        if (this.pilhaVazia()) {
            return null;
        }
        return this.pilha[this.posicaoPilha];
    }

    public void list(){
        if(!empty()){
           for(int i = this.last();i >= 0; i--)
                System.out.print(this.pilha[i]);
        }    
    }

    public Object pop() {
        if (pilhaVazia()) {
            return null;
        }
        return this.pilha[this.posicaoPilha--];
    }

    public void push(Object valor) {
        if (this.posicaoPilha < this.pilha.length - 1) {
            this.pilha[++posicaoPilha] = valor;
        }
    }
}