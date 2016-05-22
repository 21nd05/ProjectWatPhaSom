package camt.se331;

import camt.se331.shoppingcart.entity.User;
import camt.se331.shoppingcart.repository.UserRepository;
import org.junit.Test;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import static org.mockito.Matchers.anyObject;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by pan on 5/21/2016.
 */
/*public class UserAccountTest {

    public void addUser(){
        UserRepository userRepository = mock(UserRepository.class);

        //ด้านล่างนี้คือ เมื่อ userRepository.save(ค่าอะไรก็ตาม). ให้ตอบสนองกลับมาเป็นค่า...
        when(userRepository.save(anyObject())).thenAnswer(new Answer<User>(){

            @Override
            public User answer(InvocationOnMock invocationOnMock) throws Throwable {
                Object[] args = invocationOnMock.getArguments();
                User user = (User) args[0];
                return new User();
            }

        });
    }
}*/
