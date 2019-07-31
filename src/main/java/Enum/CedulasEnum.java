package Enum;

public enum CedulasEnum {

        CEDULA_CEM(100),
        CEDULA_CINQUENTA(50),
        CEDULA_VINTE(20),
        CEDULA_DEZ(10),
        CEDULA_CINCO(5),
        CEDULA_DOIS(2);

    private int valorNota;

    CedulasEnum(int valorNota) {
        this.valorNota = valorNota;
    }

    public int getValorNota() {
        return this.valorNota;
    }
}

