package ma.dxc.apps.sigestion.controllers;

import ma.dxc.apps.sigestion.models.Deal;
import ma.dxc.apps.sigestion.services.DealsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/deals")
public class DealsController {

    @Autowired DealsServices dealsServices;

    @GetMapping("/all")
    public List<Deal> getAllDeals(){
        return dealsServices.getDeals();
    }
}
