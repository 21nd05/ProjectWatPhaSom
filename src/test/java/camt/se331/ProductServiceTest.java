package camt.se331;

import camt.se331.shoppingcart.controller.ProductController;
import camt.se331.shoppingcart.dao.ProductDao;
import camt.se331.shoppingcart.entity.Product;
import camt.se331.shoppingcart.service.ProductServiceImpl;
import junitparams.JUnitParamsRunner;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import static junitparams.JUnitParamsRunner.$;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static sun.nio.cs.Surrogate.is;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.omg.CORBA.Object;
import org.springframework.validation.BindingResult;

import java.util.List;

import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.notNullValue;
import static junitparams.JUnitParamsRunner.$;

/**
 * Created by pan on 5/21/2016.
 */
@RunWith(JUnitParamsRunner.class)
public class ProductServiceTest {
    ProductServiceImpl productService;
//    @Before
//    public void setting(){
//        productService = new ProductServiceImpl();
//        productService.s
//    }

    private Product product = new Product("milk",25.00);
    ProductDao producDao = mock(ProductDao.class);

    @Test
    public  void  addProduct() {
        when(producDao.getProduct((long) 0)).thenReturn(product);

        ProductController pd = new ProductController();
    }

}