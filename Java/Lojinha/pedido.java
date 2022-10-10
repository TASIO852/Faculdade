public class pedido {

    private int pedidoID, dia, mes, ano;
    private float valorTotalCalculado;
    private int remove = 0;

    public void setPedido(int meuPedido, float valorTC) {
        pedidoID = meuPedido;
        valorTotalCalculado = valorTC;
    }

    public int getPedidoID() {
        return pedidoID;
    }

    public float getValorTC() {
        return valorTotalCalculado;
    }

    public void setPedidoData(int diap, int mesp, int anop) {
        dia = diap;
        mes = mesp;
        ano = anop;
    }

    public int getPedidoDia() {
        return dia;
    }

    public int getPedidoMes() {
        return mes;
    }

    public int getPedidoAno() {
        return ano;
    }

    public void setpedidoRemover(int removido) {
        remove = removido;
    }

    public int getpedidoRemover() {
        return remove;
    }

    public void pedidoCadastrado() {

        if (getpedidoRemover() == 0) {
            System.out.println("Pedido cadastrado - Código:" + getPedidoID() + " Valor:" + getValorTC());
            System.out.println("Criado em:" + getPedidoDia() + "/" + getPedidoMes() + "/" + getPedidoAno());
        } else {
            System.out.println("Status - Foi Removido");
        }

    }
}