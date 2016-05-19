package camt.se331.shoppingcart.config;

import camt.se331.shoppingcart.dao.ShoppingCartDao;
import camt.se331.shoppingcart.entity.*;
import camt.se331.shoppingcart.repository.ProductRepository;
import camt.se331.shoppingcart.repository.ShoppingCartRepository;
import camt.se331.shoppingcart.repository.UserRepository;
import camt.se331.shoppingcart.service.ImageUtil;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * Created by Dto on 2/11/2015.
 */
@Component
@Profile("db.init")
public class DatabaseInitializationBean implements InitializingBean {
    @Autowired
    ProductRepository productRepository;
    @Autowired
    ShoppingCartRepository shoppingCartRepository;

    @Autowired
    UserRepository userRepository;
    @Override
    public void afterPropertiesSet() throws Exception {
        Product[] initProduct = {
                new Product(1l, "ข้าวฮาง", "ผลิตภัณฑ์ \"ข้าววิธีธรรมชาติ\" \n" +
                        "จุดเด่น  -  ด้านสายพันธุ์ข้าว \"ข้าวโปโละ\"  เป็นสายพันธุ์ข้าวท้องถิ่นของ 'ชาวเขา' เผ่าปกาเกอะญอ \n" +
                        " มีลักษณะเป็นเม็ดกลม ป้อม มีความนุ่มแบบข้าวเจ้าคล้ายข้าวญี่ปุ่น และมีความเหนียวแบบข้าวเหนียวอยู่ในเมล็ดเดียวกัน\n"+
                        "ปริมาณ 1 กิโลกรัม", 100.00, 85.00, ImageUtil.resizeImage(ImageUtil.getImage("pic/product2.jpg"), 200)),
                new Product(2l, "ข้าวกล้องดอย", "ผลิตภัณฑ์ \"ข้าววิธีธรรมชาติ\" \n" +
                        "จุดเด่น  -  ด้านสายพันธุ์ข้าว \"ข้าวโปโละ\"  เป็นสายพันธุ์ข้าวท้องถิ่นของ 'ชาวเขา' เผ่าปกาเกอะญอ\n" +
                        "มีลักษณะเป็นเม็ดกลม ป้อม มีความนุ่มแบบข้าวเจ้าคล้ายข้าวญี่ปุ่น และมีความเหนียวแบบข้าวเหนียวอยู่ในเมล็ดเดียวกัน\n"+
                        "ปริมาณ 1 กิโลกรัม", 50.00, 35.00, ImageUtil.getImage("pic/product6.jpg")),
                new Product(3l, "ข้าวขาว","ผลิตภัณฑ์ \"ข้าววิธีธรรมชาติ\" \n" +
                        "จุดเด่น - ด้านสายพันธุ์ข้าว \"ข้าวโปโละ เป็นสายพันธุ์ข้าวท้องถิ่นของ 'ชาวเขา' เผ่าปกาเกอะญอ \n"+
                        "มีลักษณะเป็นเม็ดกลม ป้อม มีความนุ่มแบบข้าวเจ้าคล้ายข้าวญี่ปุ่น และมีความเหนียวแบบข้าวเหนียวอยู่ในเมล็ดเดียวกัน\n"+
                        "ปริมาณ 1 กิโลกรัม", 40.00,30.00, ImageUtil.getImage("pic/product4.jpg")),
                new Product(4l, "หญ้าหวาน", " จุดเด่น -  หญ้าหวานอินทรีย์ \n" +
                        "คุณสมบัติของหญ้าหวานที่ให้ความหวานแทนน้ำตาล เหมาะสำหรับผู้ป่วยโรคเบาหวาน \n"+
                        "ปริมาณ 1 กิโลกรัม", 70.00, 60.00, ImageUtil.getImage("pic/product5.jpg")),
                new Product(5l, "เก๊กฮวย", "จุดเด่น  -  ปลอดสารเคมี\n" +
                        "-  มีกลิ่นหอม ใช้กระบวนการอบดอกสดแทนการนึ่ง\n" +
                        "-  คงสภาพสีและกลิ่นตามธรรมชาติ \n" +
                        "-  เป็นดอกเก๊กฮวยอบแห้ง \n"+
                        "ปริมาณ 50 กรัม", 60.00, 50.00, ImageUtil.getImage("pic/product8.jpg")),
                new Product(6l, "กล้วยทอดแดง", "เป็นกล้วยออแกนิคจากธรรมชาตผลิตจากกล้วยน้ำว้า\n"+
                        "ปริมาณ 1 กิโลกรัม",100.00, 50.00, ImageUtil.getImage("pic/product11.jpg")),
                new Product(7l, "กล้วยทอดเหลือง", "เป็นกล้วยออแกนิคจากธรรมชาตผลิตจากกล้วยไข\n"+
                        "ปริมาณ 400 กรัม", 50.00, 40.00, ImageUtil.getImage("pic/product12.jpg")),
                new Product(8l, "กาแฟฮํกป่า", "กาแฟเป็นพืชที่ต้องพึ่งพาและเกื้อกูลผืนป่า ซึ่งต่างจากพืชเศรษฐกิจทั่วไปที่ต้องถางป่าให้เตียนถึงจะปลูกได้"+
                        "กาแฟผาส้มเกิดจากแนวคิด คนอยู่กับป่า...ป่ารักษ์แผ่นดิน\n"+
                        "ปริมาณ 250 กรัม", 180.00, 150.00, ImageUtil.getImage("pic/product3.jpg"))
        };

        productRepository.save(Arrays.asList(initProduct));


        ShoppingCart shoppingCart = new ShoppingCart();
        List<SelectedProduct> selectedProducts = new ArrayList<>();
        SelectedProduct[] initSelectedProduct = {
                new SelectedProduct(initProduct[2], 5),
                new SelectedProduct(initProduct[4], 2),
                new SelectedProduct(initProduct[1], 1),
        };
        selectedProducts.addAll(Arrays.asList(initSelectedProduct));
        Calendar calendar = new GregorianCalendar(2015, 4, 7);
        shoppingCart.setSelectedProducts(selectedProducts);
        shoppingCart.setPurchaseDate(calendar.getTime());
        shoppingCart.setId(1L);
        shoppingCartRepository.save(shoppingCart);

        // add user
        Role adminRole = new Role("admin");
        Role userRole = new Role("Retail customer");
        Role userRole2 = new Role("Wholesale customer");


        User admin = new User();
        admin.setName("Suchada");
        admin.setLastName("Klomkaew");
        admin.setPhoneNumber("0812345678");
        admin.setUsername("admin");
        admin.setEmail("panpan.littlpan@gmail.com");
        admin.setPassword("123456");
        Set<Role> roles = new HashSet<>();
        roles.add(adminRole);
        admin.setRoles(roles);
        Address adminAddress = new Address("99/3","-","4","Sutep","Muang", "CNX","50200");
        Set<Address> addresses1 = new HashSet<>();
        addresses1.add(adminAddress);
        admin.setAddresses(addresses1);

        User user = new User();
        user.setName("Mojune");
        user.setLastName("Pednoi");
        user.setPhoneNumber("0823456789");
        user.setUsername("mojune");
        user.setEmail("user@yahoo.com");
        user.setPassword("123456");
        Set<Role> roles2 = new HashSet<>();
        roles2.add(userRole);
        user.setRoles(roles2);
        Address juneAddress = new Address("99/3","-","4","สุทเพ","เมือง", "เชียงใหม่","50200");
        Set<Address> addresses2 = new HashSet<>();
        addresses2.add(juneAddress);
        admin.setAddresses(addresses2);

        User foreignUser = new User();
        foreignUser.setName("Nepjune");
        foreignUser.setLastName("Baribooo");
        foreignUser.setPhoneNumber("084567890");
        foreignUser.setUsername("nepnoi");
        foreignUser.setEmail("foreign@yahoo.com");
        foreignUser.setPassword("123456");
        Set<Role> roles3 = new HashSet<>();
        roles3.add(userRole2);
        foreignUser.setRoles(roles3);
        Address nepAddress = new Address("3","โคกอีเลิ้ง","4","สี่มุมเมือง","ดอยสะเก็ด", "เชียงใหม่","50123");
        Set<Address> addresses3 = new HashSet<>();
        addresses3.add(nepAddress);
        admin.setAddresses(addresses3);

        userRepository.save(admin);
        userRepository.save(user);
        userRepository.save(foreignUser);

    }
}
