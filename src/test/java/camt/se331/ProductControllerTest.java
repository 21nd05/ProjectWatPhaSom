package camt.se331;

import camt.se331.shoppingcart.controller.ProductController;
import camt.se331.shoppingcart.dao.DbProductDao;
import camt.se331.shoppingcart.dao.ProductDao;
import camt.se331.shoppingcart.entity.Product;
import camt.se331.shoppingcart.entity.SelectedProduct;
import camt.se331.shoppingcart.repository.ProductRepository;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.*;

/**
 * Created by pan on 5/21/2016.
 */
public class ProductControllerTest {
                                                                            // total กับ wholesale มั้ง - -
    private Product product = new Product(20l,"Bin","Test Description",6000.00,5500.00);
    ProductRepository productRepo = mock(ProductRepository.class);

    @Test
    public void GetTotalPriceTest (){

        SelectedProduct sp1 = new SelectedProduct(product,0);
        MatcherAssert.assertThat(sp1.getTotalPrice(), Matchers.is(0.0));
                                //อันนี้มันเอา sp1 มาใช้ ละเรียก method ชื่อ getTotalPrแหice มาเช็ก
                                //ส่วนตัวด้านหลัง Matcher.is(0.0) คือเหมือนผลลัพธ์ที่เราคาดหวังอ่ะ
                                //ตอนนี้หวังให้ผลออกมาเท่ากับ 0.0 เพราะแอดไป 0 product
        sp1.setAmount(2);
        MatcherAssert.assertThat(sp1.getTotalPrice(),Matchers.is(12000.0));
    }

    @Test
    public  void addProductTest() {
        when(productRepo.findOne((long) 0)).thenReturn(product);

    }





}
