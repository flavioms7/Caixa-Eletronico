package Entity;

import java.util.HashMap;

public class Caixa {

    private int valorParaSaque;

    public Caixa() {

    }



    public int getValorParaSaque() {
        return valorParaSaque;
    }

    public void setValorParaSaque(int valorParaSaque) {
        this.valorParaSaque = valorParaSaque;
    }

    public HashMap<Integer, Integer> sacar(int valorSolicitado) throws NullPointerException{

        HashMap<Integer, Integer> retorno = new HashMap<Integer, Integer>();
        if(this.isUmaCedula(valorSolicitado)){

            retorno.put(valorSolicitado, 1);

        }else if(valorSolicitado == 1 || valorSolicitado == 3) {

            throw new NullPointerException();

        }else{

           retorno = getColecaoQuantidadeCedulas(valorSolicitado);

        }

        return retorno;
    }

    private HashMap<Integer, Integer> getColecaoQuantidadeCedulas(int valorSolicitado) {

        HashMap<Integer, Integer> retorno = new HashMap<Integer, Integer>();
        int qtdCedula = 0;

        while (valorSolicitado > 0){

            if(valorSolicitado%100 >= 0 && valorSolicitado%100 != valorSolicitado) {

                valorSolicitado = valorSolicitado - 100;

                if(!retorno.containsKey(100)) {
                    retorno.put(100, 1);
                }else {
                    qtdCedula = retorno.get(100);
                    qtdCedula++;
                    retorno.put(100, qtdCedula);
                }

            }else if(valorSolicitado%50 >= 0 && valorSolicitado%50 != valorSolicitado) {

                valorSolicitado = valorSolicitado - 50;

                if(!retorno.containsKey(50)) {
                    retorno.put(50, 1);
                }else {

                    qtdCedula = retorno.get(50);
                    qtdCedula++;
                    retorno.put(50, qtdCedula);
                }

            }else if(valorSolicitado%20 >= 0 && valorSolicitado%20 != valorSolicitado) {

                valorSolicitado = valorSolicitado - 20;

                if(!retorno.containsKey(20)) {
                    retorno.put(20, 1);
                }else {
                    qtdCedula = retorno.get(20);
                    qtdCedula++;
                    retorno.put(20, qtdCedula);
                }

            }else if(valorSolicitado%10 >= 0 && valorSolicitado%10 != valorSolicitado) {

                valorSolicitado = valorSolicitado - 10;

                if(!retorno.containsKey(10)) {
                    retorno.put(10, 1);
                }else {
                    qtdCedula = retorno.get(10);
                    qtdCedula++;
                    retorno.put(10, qtdCedula);
                }

            }else if(valorSolicitado%5 >=0 && valorSolicitado%10 != valorSolicitado) {

                valorSolicitado = valorSolicitado - 5;

                if(!retorno.containsKey(5)) {
                    retorno.put(5, 1);
                }else {
                    qtdCedula = retorno.get(5);
                    qtdCedula++;
                    retorno.put(5, qtdCedula);
                }
            }else if(valorSolicitado%2 >= 0 && valorSolicitado%2 != valorSolicitado) {

                valorSolicitado = valorSolicitado - 2;

                if(!retorno.containsKey(2)) {
                    retorno.put(2, 1);
                }else {
                    qtdCedula = retorno.get(2);
                    qtdCedula++;
                    retorno.put(2, qtdCedula);
                }
            }else{

                throw new NullPointerException();
            }
        }
        return retorno;
    }

    private boolean isPreencherColecao(int numeroNotas){

        if(numeroNotas != 0){
            return true;
        }

        return false;
    }

    private boolean isUmaCedula(int valorSolicitado){
        boolean retorno = false;

        if(valorSolicitado == 2
                || valorSolicitado == 5
                    || valorSolicitado == 10
                        || valorSolicitado == 20
                            || valorSolicitado == 50
                                || valorSolicitado == 100){
            retorno = true;

        }
        return retorno;
    }
}
