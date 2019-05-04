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
    }

    public List<Deal> getDeals(){
        return deals;
    }
}
