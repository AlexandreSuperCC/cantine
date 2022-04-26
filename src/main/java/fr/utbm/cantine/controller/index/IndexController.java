package fr.utbm.cantine.controller.index;

import fr.utbm.cantine.controller.BaseController;
import fr.utbm.cantine.model.PlatDomain;
import fr.utbm.cantine.service.IPlatService;
import fr.utbm.cantine.utils.APIResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Type IndexController.java
 * @Desc the controller for the index page
 * @author yuan.cao@utbm.fr
 * @date 26/04/2022 12:26
 * @version 1.0
 */
@RestController
@RequestMapping(value = "/")
public class IndexController extends BaseController {

    @Autowired
    IPlatService iPlatService;


    @GetMapping("queryAllPlats")
    public APIResponse<List<PlatDomain>> getAllPlats(){
        return iPlatService.queryAllPlats();
    }




    @Override
    public APIResponse getBaseData() {
        return null;
    }
}