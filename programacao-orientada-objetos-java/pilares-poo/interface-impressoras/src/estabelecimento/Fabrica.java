package estabelecimento;

import esquipamentos.copiadora.Copiadora;
import esquipamentos.digitalizadora.Digitalizadora;
import esquipamentos.impressora.Deskjet;
import esquipamentos.impressora.Impressora;
import esquipamentos.impressora.LaserJet;
import esquipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();

        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;


        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
