package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

       /*
        OutsourcedPart o= new OutsourcedPart();
        o.setCompanyName("Western Governors University");
        o.setName("out test");
        o.setInv(5);
        o.setPrice(20.0);
        o.setId(100L);
        outsourcedPartRepository.save(o);
        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());
        */
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }

        /*
        Product bicycle= new Product("bicycle",100.0,15);
        Product unicycle= new Product("unicycle",100.0,15);
        productRepository.save(bicycle);
        productRepository.save(unicycle);
        */

        if (partRepository.count() == 0) {
            //create an objects from InhousePart
            InhousePart controller = new InhousePart();
            InhousePart powersupply = new InhousePart();
            InhousePart memorycard = new InhousePart();
            InhousePart rumblepack = new InhousePart();
            InhousePart avcable = new InhousePart();
            //setting values
            controller.setId(1);
            controller.setName("Controller");
            controller.setPrice(35.00);
            controller.setInv(50);
            controller.setMinInv(1);
            controller.setMaxInv(75);

            powersupply.setId(2);
            powersupply.setName("Power Supply");
            powersupply.setPrice(25.00);
            powersupply.setInv(40);
            powersupply.setMinInv(1);
            powersupply.setMaxInv(110);

            memorycard.setId(3);
            memorycard.setName("Memory Card");
            memorycard.setPrice(15.50);
            memorycard.setInv(100);
            memorycard.setMinInv(1);
            memorycard.setMaxInv(100);

            rumblepack.setId(4);
            rumblepack.setName("Rumble Pack");
            rumblepack.setPrice(55.00);
            rumblepack.setInv(70);
            rumblepack.setMinInv(1);
            rumblepack.setMaxInv(200);

            avcable.setId(5);
            avcable.setName("A/V Cables");
            avcable.setPrice(10.00);
            avcable.setInv(83);
            avcable.setMinInv(1);
            avcable.setMaxInv(150);

            //Saving Part
            partRepository.save(controller);
            partRepository.save(powersupply);
            partRepository.save(memorycard);
            partRepository.save(rumblepack);
            partRepository.save(avcable);



        }
        if (productRepository.count() == 0) {
            //creating an objects from Product
            Product n75 = new Product();
            Product dreamcast = new Product();
            Product ds = new Product();
            Product xbox = new Product();
            Product playstation = new Product();
            //setting values
            n75.setId(100);
            n75.setName("n75");
            n75.setPrice(150.00);
            n75.setInv(55);
            n75.setMinInv(1);
            n75.setMaxInv(100);

            dreamcast.setId(101);
            dreamcast.setName("DreamCast");
            dreamcast.setPrice(225.00);
            dreamcast.setInv(45);
            dreamcast.setMinInv(1);
            dreamcast.setMaxInv(100);

            ds.setId(102);
            ds.setName("DS");
            ds.setPrice(50.00);
            ds.setInv(15);
            ds.setMinInv(1);
            ds.setMaxInv(100);

            xbox.setId(103);
            xbox.setName("Xbox");
            xbox.setPrice(200.00);
            xbox.setInv(100);
            xbox.setMinInv(1);
            xbox.setMaxInv(100);

            playstation.setId(104);
            playstation.setName("Playstation");
            playstation.setPrice(175.00);
            playstation.setInv(33);
            playstation.setMinInv(1);
            playstation.setMaxInv(100);
            //saving products
            productRepository.save(n75);
            productRepository.save(dreamcast);
            productRepository.save(ds);
            productRepository.save(xbox);
            productRepository.save(playstation);
        }

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
