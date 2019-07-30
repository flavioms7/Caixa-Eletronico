package Entity;

import java.util.HashMap;
import Enum.CedulasEnum;

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

            if(valorSolicitado%CedulasEnum.CEDULA_CEM.getValorNota() >= 0 && valorSolicitado%CedulasEnum.CEDULA_CEM.getValorNota() != valorSolicitado) {

                valorSolicitado = valorSolicitado - CedulasEnum.CEDULA_CEM.getValorNota();

                if(!retorno.containsKey(CedulasEnum.CEDULA_CEM.getValorNota())) {
                    retorno.put(CedulasEnum.CEDULA_CEM.getValorNota(), 1);
                }else {
                    qtdCedula = retorno.get(CedulasEnum.CEDULA_CEM.getValorNota());
                    qtdCedula++;
                    retorno.put(CedulasEnum.CEDULA_CEM.getValorNota(), qtdCedula);
                }

            }else if(valorSolicitado%CedulasEnum.CEDULA_CINQUENTA.getValorNota() >= 0 && valorSolicitado%CedulasEnum.CEDULA_CINQUENTA.getValorNota() != valorSolicitado) {

                valorSolicitado = valorSolicitado - CedulasEnum.CEDULA_CINQUENTA.getValorNota();

                if(!retorno.containsKey(CedulasEnum.CEDULA_CINQUENTA.getValorNota())) {
                    retorno.put(CedulasEnum.CEDULA_CINQUENTA.getValorNota(), 1);
                }else {

                    qtdCedula = retorno.get(CedulasEnum.CEDULA_CINQUENTA.getValorNota());
                    qtdCedula++;
                    retorno.put(CedulasEnum.CEDULA_CINQUENTA.getValorNota(), qtdCedula);
                }

            }else if(valorSolicitado%CedulasEnum.CEDULA_VINTE.getValorNota() >= 0 && valorSolicitado%CedulasEnum.CEDULA_VINTE.getValorNota() != valorSolicitado) {

                valorSolicitado = valorSolicitado - CedulasEnum.CEDULA_VINTE.getValorNota();

                if(!retorno.containsKey(CedulasEnum.CEDULA_VINTE.getValorNota())) {
                    retorno.put(CedulasEnum.CEDULA_VINTE.getValorNota(), 1);
                }else {
                    qtdCedula = retorno.get(CedulasEnum.CEDULA_VINTE.getValorNota());
                    qtdCedula++;
                    retorno.put(CedulasEnum.CEDULA_VINTE.getValorNota(), qtdCedula);
                }

            }else if(valorSolicitado%CedulasEnum.CEDULA_DEZ.getValorNota() >= 0 && valorSolicitado%CedulasEnum.CEDULA_DEZ.getValorNota() != valorSolicitado) {

                valorSolicitado = valorSolicitado - CedulasEnum.CEDULA_DEZ.getValorNota();

                if(!retorno.containsKey(CedulasEnum.CEDULA_DEZ.getValorNota())) {
                    retorno.put(CedulasEnum.CEDULA_DEZ.getValorNota(), 1);
                }else {
                    qtdCedula = retorno.get(CedulasEnum.CEDULA_DEZ.getValorNota());
                    qtdCedula++;
                    retorno.put(CedulasEnum.CEDULA_DEZ.getValorNota(), qtdCedula);
                }

            }else if(valorSolicitado%CedulasEnum.CEDULA_CINCO.getValorNota() >=0 && valorSolicitado%CedulasEnum.CEDULA_CINCO.getValorNota() != valorSolicitado && valorSolicitado%CedulasEnum.CEDULA_CINCO.getValorNota() >1 ) {

                valorSolicitado = valorSolicitado - CedulasEnum.CEDULA_DEZ.getValorNota();

                if(!retorno.containsKey(CedulasEnum.CEDULA_DEZ.getValorNota())) {
                    retorno.put(CedulasEnum.CEDULA_DEZ.getValorNota(), 1);
                }else {
                    qtdCedula = retorno.get(CedulasEnum.CEDULA_DEZ.getValorNota());
                    qtdCedula++;
                    retorno.put(CedulasEnum.CEDULA_DEZ.getValorNota(), qtdCedula);
                }
            }else if(valorSolicitado%CedulasEnum.CEDULA_DOIS.getValorNota() >= 0 && valorSolicitado%CedulasEnum.CEDULA_DOIS.getValorNota() != valorSolicitado) {

                valorSolicitado = valorSolicitado - CedulasEnum.CEDULA_DOIS.getValorNota();

                if(!retorno.containsKey(CedulasEnum.CEDULA_DOIS.getValorNota())) {
                    retorno.put(CedulasEnum.CEDULA_DOIS.getValorNota(), 1);
                }else {
                    qtdCedula = retorno.get(CedulasEnum.CEDULA_DOIS.getValorNota());
                    qtdCedula++;
                    retorno.put(CedulasEnum.CEDULA_DOIS.getValorNota(), qtdCedula);
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

        if(valorSolicitado == CedulasEnum.CEDULA_DOIS.getValorNota()
                || valorSolicitado == CedulasEnum.CEDULA_CINCO.getValorNota()
                    || valorSolicitado == CedulasEnum.CEDULA_DEZ.getValorNota()
                        || valorSolicitado == CedulasEnum.CEDULA_VINTE.getValorNota()
                            || valorSolicitado == CedulasEnum.CEDULA_CINQUENTA.getValorNota()
                                || valorSolicitado == CedulasEnum.CEDULA_CEM.getValorNota()){
            retorno = true;
        }
        return retorno;
    }
}
