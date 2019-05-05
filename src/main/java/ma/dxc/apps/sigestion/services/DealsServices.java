package ma.dxc.apps.sigestion.services;

import ma.dxc.apps.sigestion.models.Deal;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DealsServices {
    private static List<Deal> deals = new ArrayList<>();
    static {
        deals.add(new Deal("154865","COCA COLA", "plum spum trum"));
        deals.add(new Deal("587575","ZKIKA", "khrum zbum trum"));
        deals.add(new Deal("855264","TRIMA", "klwa zfhh cfgfg"));
        deals.add(new Deal("456456","CGY", "plum rfgttgg rfgg"));
        deals.add(new Deal("865785","SQLy", "khsfdf dfv gh rum"));
        deals.add(new Deal("855784","CGYEM", "cvdfv dfg fgdgb"));
        deals.add(new Deal("587515","ALOS", "plsfvfvb gbhg um"));
        deals.add(new Deal("582575","MOKAS", "khrum sdf dfgdg dgv"));
        deals.add(new Deal("145864","TETAS", "klw cvcv a zdgdgv"));
    }

    public List<Deal> getDeals(){
        return deals;
    }
}
