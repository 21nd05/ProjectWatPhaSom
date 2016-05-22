package camt.se331;

import camt.se331.shoppingcart.entity.Product;
import camt.se331.shoppingcart.entity.SelectedProduct;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by pan on 5/21/2016.
 */
public class SelectedProductTest {


    @Test
    public void testGetTotalProductPrice(){
        Product product = new Product(1l,"ข้าวฮาง","The worst iphone ever",60.0);
        SelectedProduct selectedProduct = new SelectedProduct(product,0);
        assertThat(selectedProduct.getTotalPrice(),is(0.0));
        selectedProduct.setAmount(1);
        assertThat(selectedProduct.getTotalPrice(),is(60.0));
        selectedProduct.setAmount(2);
        assertThat(selectedProduct.getTotalPrice(),is(120.0));
        selectedProduct.setAmount(3);
        assertThat(selectedProduct.getTotalPrice(),is(50.0));
    }

//    @Test
//    public void testGetTotalProductPriceUsingMock(){
//        Product p = mock(Product.class);
//        when(p.getTotalPrice()).thenReturn(1000.0);
//        SelectedProduct sp = new SelectedProduct(p,0);
//        assertThat(sp.getTotalPrice(),is(0.0));
//        when(p.getTotalPrice()).thenReturn(2500.00);
//        sp.setProduct(p);
//        sp.setAmount(10);
//        when(p.getTotalPrice()).thenReturn(25000.00);
//    }
}
